package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaJenkinsApplication {

	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome to jenkins CI CD Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaJenkinsApplication.class, args);
	}

}
