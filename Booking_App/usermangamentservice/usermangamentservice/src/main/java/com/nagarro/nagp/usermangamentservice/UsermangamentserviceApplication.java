package com.nagarro.nagp.usermangamentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UsermangamentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermangamentserviceApplication.class, args);
	}
	
	@GetMapping("test")
	public String testMethod() {
		return "Hello Test";
	}

}
