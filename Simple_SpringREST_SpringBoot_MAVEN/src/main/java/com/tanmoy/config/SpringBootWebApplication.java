package com.tanmoy.config;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.tanmoy"})
@EnableJpaRepositories(basePackages={"com.tanmoy"})
@EntityScan(basePackages={"com.tanmoy"})
//instead of above line , you can also use below two lines(older)
/*@ComponentScan(basePackages={"com.tanmoy"})
@EnableAutoConfiguration*/

//This class is required to create deployable war file
public class SpringBootWebApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
