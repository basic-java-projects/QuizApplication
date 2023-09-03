package com.twg.spring.springhibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="employeeId")
	private int id;	
	private String name;
	private String address;
	private String contact;
	@Column(name="Experience")
	private int exp;
	
	public Employee(){}

	public Employee(int id, String name, String address, String contact, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
