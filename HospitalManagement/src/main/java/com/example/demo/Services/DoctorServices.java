package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Mode.Doctor;

@Service
public interface DoctorServices{
	
	//Customize Method create,get data,delete,Update,FindByid
	Doctor createDoctor(Doctor doctor);
	List<Doctor> findAllDoctor();
	void deleteDoctor(int id);
	Doctor updateDoctor(Doctor doctor);
	List<Doctor>findByid(int id);
	//List<Doctor>findByName(String Name);
	
}
