package com.example.demo.Services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Mode.Patient;
import com.example.demo.Repository.PatientRepository;
import com.example.demo.Services.PatientServices;

@Repository
public class PatientServicesimpl implements PatientServices{
	@Autowired
	PatientRepository patientRepository;
	
	//Create Update Delete method
	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> findAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		Patient _patient = patientRepository.findById(patient.getId()).get();
		_patient.setName(patient.getName());
		_patient.setMobno(patient.getMobno());
		_patient.setAddress(patient.getAddress());
		_patient.setDisease(patient.getDisease());
		return patientRepository.save(_patient);
	}

	@Override
	public List<Patient> findByid(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findByid(id);
	}

	/*@Override
	public List<Patient> findByname(String name) {
		// TODO Auto-generated method stub
		return patientRepository.findByname(name);
	}*/



}