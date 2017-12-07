package com.tanmoy.employee.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tanmoy.employee.dao.EmployeeDaoWithSpringORM;
import com.tanmoy.employee.domain.EmployeeDetails;

@Repository
public class EmployeeDaoWithSpringORMImpl implements EmployeeDaoWithSpringORM{

	@Autowired
	@Qualifier("sessfactory")
	SessionFactory sessfactory;

	@Override
	public void save(EmployeeDetails employeeDetails) {
		sessfactory.getCurrentSession().save(employeeDetails);
		
	}
}
