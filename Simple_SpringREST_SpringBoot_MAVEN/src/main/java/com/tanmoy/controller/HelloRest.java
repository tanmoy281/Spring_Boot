package com.tanmoy.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simaple")
public class HelloRest {

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
}