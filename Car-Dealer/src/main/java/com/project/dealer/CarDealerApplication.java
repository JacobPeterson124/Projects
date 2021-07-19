package com.project.dealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages="com.project")
public class CarDealerApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder 
configure(SpringApplicationBuilder application) {
		return application.sources(CarDealerApplication.class);
	}


	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarDealerApplication.class, args);
	}

	}


