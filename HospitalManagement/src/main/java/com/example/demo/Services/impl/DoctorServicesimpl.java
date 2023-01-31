package com.example.demo.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Mode.Doctor;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Services.DoctorServices;
@Repository
public class DoctorServicesimpl implements DoctorServices {
	@Autowired
	 DoctorRepository doctorRepository;

	//Create Delete update Method 
	@Override
	public Doctor createDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> findAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Doctor _doctor = doctorRepository.findById(doctor.getId()).get();
		_doctor.setName(doctor.getName());
		_doctor.setPhno(doctor.getPhno());
		_doctor.setAddress(doctor.getAddress());
		_doctor.setSpecification(doctor.getSpecification());
		_doctor.setFees(doctor.getFees());
		return doctorRepository.save(_doctor);
	}

	

	@Override
	public List<Doctor> findByid(int id) {
		// TODO Auto-generated method stub
		return doctorRepository.findByid(id);
	}
	
	/*
	@Override
	public List<Doctor> findByName(String name) {
		// TODO Auto-generated method stub
		return doctorRepository.findByname(name);
	}*/

}
