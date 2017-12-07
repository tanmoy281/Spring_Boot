package com.tanmoy.employee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* This entity is used to explain Spring ORM*/


@Entity
@Table(name = "EmpDetails")
public class EmployeeDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long objId;
	public String firstName;
	public String lastName;
	public Long getObjId() {
		return objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
