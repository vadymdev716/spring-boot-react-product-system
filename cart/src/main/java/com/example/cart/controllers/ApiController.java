package com.example.cart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
