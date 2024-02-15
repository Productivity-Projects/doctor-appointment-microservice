package com.doctor_appointment.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DoctorRegistration {
	Integer id;
	String doctorId;
	String name;
	Integer doctorCategory;
	String phoneNo;
	String gender;
	String address;
	Integer salary;
	Integer experience;
	Boolean availability;
	LocalDateTime dateUpdateed;
}
