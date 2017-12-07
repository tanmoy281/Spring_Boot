package com.tanmoy.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.tanmoy.employee.domain.Employee;

public interface EmployeeDAOWithSpringDataJpa extends CrudRepository<Employee, Long>{
}

/*you don't need to implement manually, This implementation is plugged in by Spring data automatically at runtime*/

/*
https://shakeelosmani.wordpress.com/2017/02/13/step-by-step-spring-boot-hibernate-crud-web-application-tutorial/
**/

/* Spring Boot tries to auto-configure a DataSource if spring-data-jpa is in the classpath by reading the database configuration from application.properties file.*/