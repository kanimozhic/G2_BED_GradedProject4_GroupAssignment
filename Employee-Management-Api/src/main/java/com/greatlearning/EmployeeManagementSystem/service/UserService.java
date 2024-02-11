package com.greatlearning.EmployeeManagementSystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.dao.UserRegistrationDto;
import com.greatlearning.EmployeeManagementSystem.entity.User;

@Service
public interface UserService extends UserDetailsService {

	User saveUser(UserRegistrationDto registrationDto);
}
