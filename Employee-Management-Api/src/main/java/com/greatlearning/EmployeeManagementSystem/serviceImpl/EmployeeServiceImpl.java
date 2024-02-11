package com.greatlearning.EmployeeManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.entity.Employee;
import com.greatlearning.EmployeeManagementSystem.refactor.ResourceNotFoundException;
import com.greatlearning.EmployeeManagementSystem.repository.EmployeeRepository;
import com.greatlearning.EmployeeManagementSystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository empRepo;

	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public Employee saveEmp(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {

		return empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {

		Employee existingEmployee = empRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());

		empRepo.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {

		empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		empRepo.deleteById(id);
	}

	@Override
	public List<Employee> SortEmployees(Direction direction) {
		return empRepo.findAll(Sort.by(direction, "firstName"));
	}

	@Override
	public List<Employee> searchEmployee(String name) {
		List<Employee> employee = empRepo.findByfirstNameContainsAllIgnoreCase(name);
		return employee;
	}

}
