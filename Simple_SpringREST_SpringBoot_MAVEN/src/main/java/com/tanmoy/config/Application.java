package com.tanmoy.config;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.tanmoy"})
@EnableJpaRepositories(basePackages={"com.tanmoy"})
@EntityScan(basePackages={"com.tanmoy"})
//instead of above line , you can also use below two lines(older)
/*@ComponentScan(basePackages={"com.tanmoy"})
@EnableAutoConfiguration*/
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}