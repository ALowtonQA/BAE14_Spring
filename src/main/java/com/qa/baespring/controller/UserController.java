package com.qa.baespring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.baespring.domain.User;
import com.qa.baespring.service.UserService;

@RestController
public class UserController {

	private UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}

	// Get by ID (get one User)
	@GetMapping("/getById/{id}") // localhost:8080/getById/id
	public User getById(@PathVariable long id) {
		return service.getById(id);
	}
	
	@GetMapping("/getAll") // localhost:8080/getAll
	public List<User> getAll() {
		return service.getAll();
	}
	
	// Post
	@PostMapping("/create") // localhost:8080/create
	public User create(@RequestBody User user) {
		return service.create(user);
	}
	
	// Put/Patch
	
	// Delete
	
}
