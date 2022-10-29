package com.medical.fallback;

import java.util.Arrays;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.medical.domain.Medicine;
import com.medical.proxy.MedicalServiceProxy;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class MedicalServiceFallback implements MedicalServiceProxy{

	
	//@HystrixCommand(fallbackMethod="fallbackMethodMedicineById")
	

@Override
public Medicine getMedicinesById(Integer id) {
	// TODO Auto-generated method stub
	return new Medicine(id,"Paracetamol","Cipla",15,8000);
}
@Override
public void deleteMedicinesById(Integer id) {
	// TODO Auto-generated method stub
	 new Medicine(id,"Paracetamol","Cipla",15,8000);
}

@Override
public Medicine updateMedicines(Medicine medicine) {
	// TODO Auto-generated method stub
	return  new Medicine(01,"Paracetamol","Cipla",15,8000);
}

@Override
public List<Medicine> findAll() {
	// TODO Auto-generated method stub
	 return Arrays.asList(new Medicine());
}

@Override
public Medicine save(Medicine medicine) {
	// TODO Auto-generated method stub
	return  new Medicine(01,"Paracetamol","Cipla",15,8000);
}

}
