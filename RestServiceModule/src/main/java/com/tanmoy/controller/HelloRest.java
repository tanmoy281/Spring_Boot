package com.tanmoy.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.employee.domain.Employee;
import com.tanmoy.employee.domain.EmployeeDetails;
import com.tanmoy.employee.service.SimpleService;

@RestController
@RequestMapping("/simaple")
public class HelloRest {

	@Autowired
	SimpleService employeeService;
	
	private static Logger log = Logger.getLogger(HelloRest.class);
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET, produces="application/json")
	public Employee ping(){
		log.info("Logger enabled: Entering rest method\n");
		Employee e =new Employee();
		
		log.warn("Logger enabled: Use this only for warn logging");
		log.error("Logger enabled: Use this only for error logging");
		
		e.setName("Tanmoy");
		e.setAddress("Hyderabad");
		
		log.info("Logger enabled: Exiting rest method");
		
		return e;
	}
	
	@RequestMapping(value="/checkhibernate", method=RequestMethod.GET, produces="application/json")
	public Employee hibernatePing(){
		log.info("Logger enabled: Entering hibernatePing method\n");
		Employee e =new Employee();
		
		
		
		e.setName("Tanmoy");
		e.setAddress("Hyderabad");
		
		log.info("Logger enabled: Exiting hibernatePing method");
		employeeService.insertEmpWithSpringDataJpa(e);
		return e;
	}
	
	@RequestMapping(value="/checkhibernateorm", method=RequestMethod.GET, produces="application/json")
	public EmployeeDetails hibernateORMPing(){
		log.info("Logger enabled: Entering hibernateORMPing method\n");
		EmployeeDetails e =new EmployeeDetails();
		
		
		
		e.setFirstName("Tanmoy");
		e.setLastName("Banerjee");
		
		log.info("Logger enabled: Exiting hibernateORMPing method");
		employeeService.insertEmpWithSpringORM(e);
		return e;
	}
}