package com.tanmoy.employee.service;

import com.tanmoy.employee.domain.Employee;
import com.tanmoy.employee.domain.EmployeeDetails;

public interface SimpleService {
	public void insertEmpWithSpringDataJpa(Employee e);
	public void insertEmpWithSpringORM(EmployeeDetails e);
}
