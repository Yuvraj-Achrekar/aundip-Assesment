package com.example.demo.RepoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Mode.Patient;
import com.example.demo.Repository.PatientRepository;
import com.example.demo.Services.PatientServices;

@SpringBootTest
public class PatientRepositoryTest {
	@MockBean
	private PatientRepository patientRepository;
	@Autowired
	private PatientServices patientServices;
	
	//Test SavePatient Method
	@Test
	void testSavePatient() 
	{
		Patient P = new Patient(1,"Prasad Mane",708,"Hadapsar","Lung Infecton");
		Mockito.when(patientRepository.save(P)).thenReturn(P);
		assertEquals(P,patientServices.createPatient(P));
	}
	
	//Test GetAllPatient Method
	@Test
	void testGetAllPatient() 
	{
		List<Patient>Patient=Stream
				.of(new Patient(1,"Prasad Mane",708,"Hadapsar","Lung Infecton"),
			new Patient(1,"Prasad Mane",708,"Hadapsar","Lung Infecton"))
				.collect(Collectors.toList());
		Mockito.when(patientRepository.findAll()).thenReturn(Patient);
		assertEquals(2,patientServices.findAllPatient().size());
		
	}
	
	//Test DeleteCustomer Method
	@Test
	void testDeleteCustomer() 
	{
		patientServices.deletePatient(1);
		Mockito.verify(patientRepository).deleteById(1);
	}

}
