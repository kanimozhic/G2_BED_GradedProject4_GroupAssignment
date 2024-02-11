package com.greatlearning.EmployeeManagementSystem.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.dao.RoleDto;
import com.greatlearning.EmployeeManagementSystem.entity.Role;
import com.greatlearning.EmployeeManagementSystem.repository.RoleRepository;
import com.greatlearning.EmployeeManagementSystem.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepo;

	public RoleServiceImpl(RoleRepository roleRepo) {
		super();
		this.roleRepo = roleRepo;
	}

	@Override
	public Role saveRole(RoleDto roleDto) {
		Role role = new Role(roleDto.getName());
		return roleRepo.save(role);
	}

}
