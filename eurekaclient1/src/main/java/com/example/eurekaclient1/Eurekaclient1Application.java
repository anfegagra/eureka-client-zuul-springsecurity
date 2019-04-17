package com.example.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Eurekaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient1Application.class, args);
	}
	
	@GetMapping(value="/cliente1")
	public String home() {
		return "Eureka client application";
	}

}
