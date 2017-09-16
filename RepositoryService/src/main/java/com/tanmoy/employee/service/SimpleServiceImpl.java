package com.tanmoy.employee.service;

import com.tanmoy.employee.dao.EmployeeDAO;

public class SimpleServiceImpl implements SimpleService {

	
	EmployeeDAO dao;
	public void insertEmp() {
		// TODO Auto-generated method stub
		dao.insertEmployee();
	}

}
