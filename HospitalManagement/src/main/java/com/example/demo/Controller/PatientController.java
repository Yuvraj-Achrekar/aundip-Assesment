package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Mode.Patient;
import com.example.demo.Services.PatientServices;

//Controller Method
@RestController
public class PatientController {
	@Autowired
	PatientServices patientServices;

	//Create Patient
	@PostMapping("/Patient")
	public ResponseEntity<Patient> craetePatient(@Valid @RequestBody Patient patient) {
		return new ResponseEntity<Patient>(patientServices.createPatient(patient), HttpStatus.CREATED);
	}
	
	//Get All Patient
	@GetMapping(value = "/Patient")
	public List<Patient> findAllPatient() {
		return patientServices.findAllPatient();
	}

	//Delete By Id
	@DeleteMapping(value = "/Patient/{id}")
	public String deletePatient(@PathVariable int id) {
		patientServices.deletePatient(id);
		return "Patient is deleted";
	}

	//Update By Id
	@PutMapping(value = "/Patient")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientServices.updatePatient(patient);
	}
	
	//Find By Id
	@GetMapping(value="/Patient/id/{id}")
	public List<Patient>findByid(@PathVariable int id){
		return patientServices.findByid(id);
	}
	/*@GetMapping("/Patient/name/{name}")
	public List<Patient> findByname(@PathVariable String name)
	{
		return patientServices.findByname(name);
	}*/

}
