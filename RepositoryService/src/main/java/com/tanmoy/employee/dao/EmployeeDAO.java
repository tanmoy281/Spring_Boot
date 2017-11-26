package com.tanmoy.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.tanmoy.employee.dto.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Long>{
}

/*
https://shakeelosmani.wordpress.com/2017/02/13/step-by-step-spring-boot-hibernate-crud-web-application-tutorial/
**/