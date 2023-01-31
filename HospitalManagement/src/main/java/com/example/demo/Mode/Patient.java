package com.example.demo.Mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//Patient Class
public class Patient {
	
	//Default Constructor
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private long Mobno;
	private String Address;
	private String Disease;
	
	//Parameterized Constructor
	public Patient(int id, String name, long mobno, String address, String disease) {
		super();
		this.id = id;
		Name = name;
		Mobno = mobno;
		Address = address;
		Disease = disease;
	}

	//Generate Getter Setter Method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMobno() {
		return Mobno;
	}

	public void setMobno(long mobno) {
		Mobno = mobno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDisease() {
		return Disease;
	}

	public void setDisease(String disease) {
		Disease = disease;
	}

}