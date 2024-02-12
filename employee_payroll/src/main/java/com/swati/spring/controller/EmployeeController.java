package com.swati.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swati.spring.entity.Employee;
import com.swati.spring.exception.EmployeeNotFoundException;
import com.swati.spring.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private EmployeeRepository repository;	//Constructor Injection

	public EmployeeController(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}
	
	//CRUD Operations - GET, POST, PUT, DELETE
	
	@GetMapping("/employee")
	List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	@PostMapping("/employee")
	Employee addEmployee(@RequestBody Employee emp) {
		return repository.save(emp);
	}
	
	@PutMapping("employee/{id}")
	Employee changeEmployee(@RequestBody Employee newEmp, @PathVariable int id) {
		
		return repository.findById(id).map(employee -> {
				employee.setName(newEmp.getName());
				employee.setRole(newEmp.getRole());
				return repository.save(employee);
			})
			.orElseGet(() -> {
				newEmp.setId(id);
				return repository.save(newEmp);
			});
	}
	
	@GetMapping("/employee/{id}")
	Employee singleEmployee(@PathVariable int id){
		return repository.findById(id)
				.orElseThrow(() -> 
					new EmployeeNotFoundException(id));
	}
	
	@DeleteMapping("/employee/{id}")
	void deleteEmp(@PathVariable int id) {
		repository.deleteById(id);
	}
	
}
