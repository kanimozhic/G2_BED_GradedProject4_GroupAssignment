package com.greatlearning.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagementSystem.entity.Employee;
import com.greatlearning.EmployeeManagementSystem.repository.EmployeeRepository;
import com.greatlearning.EmployeeManagementSystem.service.EmployeeService;
import com.greatlearning.EmployeeManagementSystem.service.RoleService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Autowired
	EmployeeRepository employeeRepo;

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmp(employee), HttpStatus.CREATED);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}

	@DeleteMapping("/deleteEmployeeById/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
	}

	@GetMapping("/search")
	public List<Employee> searchEmployee(@RequestParam("firstName") String firstName) {
		return employeeRepo.findByfirstNameContainsAllIgnoreCase(firstName);
	}

	@GetMapping("/sortByName")
	public List<Employee> sortByName(Direction order) {
		return employeeService.SortEmployees(order);
	}

}