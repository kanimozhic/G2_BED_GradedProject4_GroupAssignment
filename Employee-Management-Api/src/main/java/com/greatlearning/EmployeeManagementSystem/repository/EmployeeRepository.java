package com.greatlearning.EmployeeManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagementSystem.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByfirstNameContainsAllIgnoreCase(String firstName);
}