package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class EntryController {

	
	@GetMapping("/user")
	public ResponseEntity<User> getUser() {
		
		User user = new User();
		user.setFirstName("Sunil");
		user.setLastName("Kumar");
		user.setUserName("skumar@ford.com");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
