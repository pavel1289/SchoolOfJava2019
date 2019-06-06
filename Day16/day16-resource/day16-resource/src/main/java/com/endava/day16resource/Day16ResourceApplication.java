package com.endava.day16resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Day16ResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day16ResourceApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
