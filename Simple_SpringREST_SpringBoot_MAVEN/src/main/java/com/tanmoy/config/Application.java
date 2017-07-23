package com.tanmoy.config;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.tanmoy"})

//instead of above line , you can also use below two lines(older)
/*@ComponentScan(basePackages={"com.tanmoy"})
@EnableAutoConfiguration*/
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}