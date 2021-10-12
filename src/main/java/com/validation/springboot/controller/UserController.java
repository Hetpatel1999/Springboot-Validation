package com.validation.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.springboot.model.User;
import com.validation.springboot.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
 
	@Autowired
	private UserService service;
	
	@PostMapping("users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		User savedUser = service.createUser(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
}
