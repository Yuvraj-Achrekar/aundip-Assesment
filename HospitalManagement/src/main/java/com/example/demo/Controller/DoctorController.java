package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Mode.Doctor;
import com.example.demo.Services.DoctorServices;

//Controller Class
@RestController
public class DoctorController {
	@Autowired
	DoctorServices doctorservices;

	//Create Method
	@PostMapping("/Doctor")
	public ResponseEntity<Doctor> craeteDoctor(@Valid @RequestBody Doctor doctor) {
		return new ResponseEntity<Doctor>(doctorservices.createDoctor(doctor), HttpStatus.CREATED);
	}
	//Get Doctor Method
	@GetMapping(value = "/Doctor")
	public List<Doctor> findAllDoctor() {
		return doctorservices.findAllDoctor();
	}
	// Delete By Id
	@DeleteMapping(value = "/Doctor/{id}")
	public String deleteDoctor(@PathVariable int id) {
		doctorservices.deleteDoctor(id);
		return "Doctor is deleted";
	}
	//Update By Id
	@PutMapping(value = "/Doctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorservices.updateDoctor(doctor);
	}
	
	//find By Id
	@GetMapping(value = "/Doctor/id/{id}")
	public List<Doctor> findByid(@PathVariable int id) {
		return doctorservices.findByid(id);
	}
/*
	@GetMapping(value = "/Doctor/name/{name}")
	public List<Doctor> findByName(@PathVariable String name) {
		return doctorservices.findByName(name);
	}*/

}
