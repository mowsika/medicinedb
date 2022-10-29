package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.domain.Medicine;
import com.medical.proxy.MedicalServiceProxy;

@RestController
@Scope("request")
public class MedicalClientController {

	@Autowired
	private MedicalServiceProxy medicalServiceProxy;
	
	@GetMapping("/get-medicines")
	public List<Medicine> getAll(){
	return medicalServiceProxy.findAll();
	}
	
	@GetMapping("/get-medicines/{id}")
	public Medicine getById(@PathVariable("id") Integer id) {
	return medicalServiceProxy.getMedicinesById(id);
	}
    
	@DeleteMapping("/delete-medicines/{id}")
	public void deleteMedicinesById(@PathVariable("id") Integer id)
	{ medicalServiceProxy.deleteMedicinesById(id);}
	
	@PostMapping("/add-medicines")
	public Medicine saveMedicines(Medicine medicine) {
		return medicalServiceProxy.save(medicine);
	}
	
    @PutMapping("/update-medicines")
	public Medicine updateMedicines(Medicine medicine) {
    	return medicalServiceProxy.updateMedicines(medicine);
    }
}
