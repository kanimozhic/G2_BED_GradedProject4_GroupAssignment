package com.greatlearning.EmployeeManagementSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagementSystem.dao.UserRegistrationDto;
import com.greatlearning.EmployeeManagementSystem.entity.User;
import com.greatlearning.EmployeeManagementSystem.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/registration")
	public User registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
		return userService.saveUser(registrationDto);

	}
}
