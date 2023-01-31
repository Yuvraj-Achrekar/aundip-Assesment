package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Mode.Patient;


public interface PatientRepository extends JpaRepository<Patient,Integer>{
	//Customize Method
List<Patient>findByid(int id);
//List<Patient> findByname(String name);
}
