package com.greatlearning.EmployeeManagementSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagementSystem.dao.RoleDto;
import com.greatlearning.EmployeeManagementSystem.entity.Role;
import com.greatlearning.EmployeeManagementSystem.service.RoleService;

@RestController
@RequestMapping("/employeedatabase")
public class RoleController {

	private RoleService roleService;

	public RoleController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}

	@PostMapping("/addroles")
	public Role addRole(@RequestBody RoleDto roleDto) {
		return roleService.saveRole(roleDto);
	}

}
