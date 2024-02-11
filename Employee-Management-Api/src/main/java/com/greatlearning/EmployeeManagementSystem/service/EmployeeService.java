package com.greatlearning.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.dao.RoleDto;
import com.greatlearning.EmployeeManagementSystem.entity.Employee;
import com.greatlearning.EmployeeManagementSystem.entity.Role;

@Service
public interface EmployeeService {
	Employee saveEmp(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(long id);

	Employee updateEmployee(Employee employee, long id);

	void deleteEmployee(long id);

	List<Employee> SortEmployees(Direction direction);

	List<Employee> searchEmployee(String name);

}
