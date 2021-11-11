package com.curso.apiRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.curso.apiRest.controllers.ProductRestController;


@SpringBootApplication
@ComponentScan(basePackageClasses = ProductRestController.class)
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
