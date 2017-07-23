package com.tanmoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simaple")
public class HelloRest {

	@RequestMapping(value="/greeting", method=RequestMethod.GET, produces="application/json")
	public Employee ping(){
		
		Employee e =new Employee();
		
		e.setName("Tanmoy");
		e.setAddress("Kolkata");
		
		return e;
	}
}