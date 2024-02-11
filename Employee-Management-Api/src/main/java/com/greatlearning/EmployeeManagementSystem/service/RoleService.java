package com.greatlearning.EmployeeManagementSystem.service;

import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.dao.RoleDto;
import com.greatlearning.EmployeeManagementSystem.entity.Role;

@Service
public interface RoleService {

	Role saveRole(RoleDto roleDto);

}
