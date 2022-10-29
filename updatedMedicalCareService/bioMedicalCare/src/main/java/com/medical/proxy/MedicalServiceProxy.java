package com.medical.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

//import com.medical.controller.RequestBody;
import com.medical.domain.Medicine;
import com.medical.fallback.MedicalServiceFallback;

@FeignClient(name="medical-service",fallback = MedicalServiceFallback.class)
public interface MedicalServiceProxy {

	@GetMapping(value="/medicines",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Medicine> findAll();
	
	@GetMapping(value="/medicines/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Medicine getMedicinesById(@PathVariable("id")Integer id);
    
	@DeleteMapping(value="/delete/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public void deleteMedicinesById(@PathVariable("id")Integer id);
	
	@PostMapping(value="/add",produces= {MediaType.APPLICATION_JSON_VALUE},consumes={MediaType.APPLICATION_JSON_VALUE})
	public Medicine save(Medicine medicine);
    
	@PutMapping(value="/update",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Medicine updateMedicines(Medicine medicine);
}
