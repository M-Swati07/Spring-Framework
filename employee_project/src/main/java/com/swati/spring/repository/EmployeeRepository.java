package com.swati.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

}
