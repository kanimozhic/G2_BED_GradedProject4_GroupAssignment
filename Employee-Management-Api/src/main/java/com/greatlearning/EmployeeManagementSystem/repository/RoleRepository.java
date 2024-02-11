package com.greatlearning.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagementSystem.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
