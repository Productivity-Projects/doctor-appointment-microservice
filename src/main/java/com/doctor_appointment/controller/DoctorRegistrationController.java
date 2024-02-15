package com.doctor_appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor_appointment.model.DoctorRegistration;
import com.doctor_appointment.service.DoctorRegistrationService;

@RestController
@RequestMapping("/doctorRegistration")
public class DoctorRegistrationController {

	@Autowired
	DoctorRegistrationService doctorRegistrationService;

	@PostMapping("add")
	public DoctorRegistration add(@RequestBody DoctorRegistration doctorRegistration) {
		return doctorRegistrationService.add(doctorRegistration);
	}

}
