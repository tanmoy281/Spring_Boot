package com.tanmoy.employee.domain;

import javax.persistence.*;

/* This entity is used to explain Spring Data*/

@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String name;
	public String address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	
}
