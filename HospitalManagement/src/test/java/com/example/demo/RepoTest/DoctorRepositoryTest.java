package com.example.demo.RepoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Mode.Doctor;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Services.DoctorServices;
@SpringBootTest
public class DoctorRepositoryTest {
	@MockBean
	private DoctorRepository doctorRepository;
	@Autowired
	private DoctorServices doctorServices;
	
	//Test SaveDoctor Method
	@Test
	void testSaveDOCTOR() 
	{
		Doctor D = new Doctor(1,"Rohidas Adhav",7057,"Hadapsar","Cardiology",200);
		Mockito.when(doctorRepository.save(D)).thenReturn(D);
		assertEquals(D,doctorServices.createDoctor(D));
	}
	
	//Test GetAllDoctor Method
	@Test
	void testGetAllDoctor() 
	{
		List<Doctor>Doctor=Stream
				.of(new Doctor(1,"Rohidas Adhav",7057,"Hadapsar","Cardiology",200),
			new Doctor(1,"Rohidas Adhav",7057,"Hadapsar","Cardiology",200))
			.collect(Collectors.toList());
		Mockito.when(doctorRepository.findAll()).thenReturn(Doctor);
		assertEquals(2,doctorServices.findAllDoctor().size());
		
	}
	
	//Test DeleteCustomer Method
	@Test
	void testDeleteDoctor() 
	{
		doctorServices.deleteDoctor(1);
		Mockito.verify(doctorRepository).deleteById(1);
	}

}
