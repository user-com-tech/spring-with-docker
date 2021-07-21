package com.tech.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello From Spring To Docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWithDockerApplication.class, args);
	}

}
