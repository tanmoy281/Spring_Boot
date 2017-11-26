package com.tanmoy.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanmoy.employee.dao.EmployeeDAO;
import com.tanmoy.employee.dto.Employee;

@Service
public class SimpleServiceImpl implements SimpleService {

	@Autowired
	EmployeeDAO dao;
	
	public void insertEmp(Employee e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}

}
