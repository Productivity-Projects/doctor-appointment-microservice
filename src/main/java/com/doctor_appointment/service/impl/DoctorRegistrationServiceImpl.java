package com.doctor_appointment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.doctor_appointment.model.DoctorRegistration;
import com.doctor_appointment.service.DoctorRegistrationService;

@Service
public class DoctorRegistrationServiceImpl implements DoctorRegistrationService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public DoctorRegistration add(DoctorRegistration doctorRegistration) {
		System.out.println("satya");
		String url = "http://localhost:8081/doctorRegistration/add";
		DoctorRegistration response = restTemplate.postForObject(url, doctorRegistration, DoctorRegistration.class);
		System.out.println("data: " + response);
		return response;
	}

}
