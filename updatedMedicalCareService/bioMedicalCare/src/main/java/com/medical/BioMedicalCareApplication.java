package com.medical;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import com.medical.domain.Medicine;
//import com.medical.proxy.MedicalServiceProxy;

//import com.medical.domain.Medicine;
//import com.medical.repository.MedicineRepository;

@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class BioMedicalCareApplication{

//	@Autowired
//	@Qualifier("medicalServiceProxy")
//	private MedicalServiceProxy medicalServiceProxy;
//	//@Autowired
//	//@Qualifier("medicineRepository")
//	//private MedicineRepository medicineRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BioMedicalCareApplication.class, args);
		System.out.println("Hystrix is running.....");
		
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		medicalServiceProxy.save(new Medicine(0, "Paracetamol", "Cipla", 15, 2000));
		medicalServiceProxy.save(new Medicine(0, "Combiflame", "Cipla", 10, 1000));
		medicalServiceProxy.save(new Medicine(0, "Disprin", "Cipla", 25, 5000));
		System.out.println(medicalServiceProxy.findAll());
	}

	*/

}
