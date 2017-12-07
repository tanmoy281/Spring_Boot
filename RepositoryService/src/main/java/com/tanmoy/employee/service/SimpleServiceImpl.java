package com.tanmoy.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tanmoy.employee.dao.EmployeeDAOWithSpringDataJpa;
import com.tanmoy.employee.dao.EmployeeDaoWithSpringORM;
import com.tanmoy.employee.domain.Employee;
import com.tanmoy.employee.domain.EmployeeDetails;

@Service
@Transactional
public class SimpleServiceImpl implements SimpleService {

	@Autowired
	EmployeeDAOWithSpringDataJpa dao;
	
	@Autowired
	EmployeeDaoWithSpringORM employeeDaoWithSpringORM;
	
	public void insertEmpWithSpringDataJpa(Employee e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}
	
	public void insertEmpWithSpringORM(EmployeeDetails e) {
		// TODO Auto-generated method stub
		employeeDaoWithSpringORM.save(e);
	}

}
