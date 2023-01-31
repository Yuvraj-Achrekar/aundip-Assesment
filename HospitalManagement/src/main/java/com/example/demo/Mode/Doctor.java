package com.example.demo.Mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//Doctor Class
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Name is Not Null")
	@NotBlank(message="name is not blank")
	private String Name;
	private long Phno;
	private String Address;
	private String Specification;
	private int Fees;
	
	//Default Constructor
	public Doctor()
	{
		
	}

	//Parameterized constructor
	public Doctor(@NotEmpty int id, String name, long phno, String address, String specification, int fees)
	{
		super();
		this.id = id;
		this.Name = name;
		this.Phno = phno;
		this.Address = address;
		this.Specification = specification;
		this.Fees = fees;
	}

	// Generate Getter Setter Method
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSpecification() {
		return Specification;
	}

	public void setSpecification(String specification) {
		Specification = specification;
	}

	public int getFees() {
		return Fees;
	}

	public void setFees(int fees) {
		Fees = fees;
	}

	public long getPhno() {
		return Phno;
	}

	public void setPhno(long phno) {
		Phno = phno;
	}
}
