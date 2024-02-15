package com.doctor_appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DoctorAppointmentMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorAppointmentMicroserviceApplication.class, args);
		
		
	}
	@Bean
	public RestTemplate RestTemplate() {
		 return new RestTemplate();
	}
}
