package com.example.breweryMono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.example.breweryMono.Services.Beerserviece")
public class BreweryMonoApplication {

	public static void main(String[] args) {

		SpringApplication.run(BreweryMonoApplication.class, args);
	}

}
