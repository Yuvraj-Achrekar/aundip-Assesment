package com.example.demo.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Mode.Patient;


@Service
public interface PatientServices {
	
	//Customize Method create,get data,delete,Update,FindByid
	Patient createPatient(Patient patient);
	List<Patient> findAllPatient();
	void deletePatient(int id);
	Patient updatePatient(Patient patient);
	List<Patient>findByid(int id);
	//List<Patient> findByname(String name);
}
