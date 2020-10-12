package com.covid.covidapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidappApplication.class, args);
	}

}
