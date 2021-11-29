package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

	
	@GetMapping("/{name}")
	public String getWelcomeMessage(@PathVariable String name) {
		return "Welcome"+name;
	}
}
