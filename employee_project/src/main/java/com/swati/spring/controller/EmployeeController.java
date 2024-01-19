package com.swati.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.swati.spring.model.Employee;
import com.swati.spring.service.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired      //Field Injection
    EmployeeService employeeService;

   @GetMapping("hi")
    String hello() {
        return "Hello Employee";
    }

    @PostMapping("save")
    public Employee addEmp(@RequestBody Employee emp) {
        return employeeService.save(emp);
    }
    
    @GetMapping("getAll")
    List<Employee> getAllEmp(){
        return employeeService.findAll();
    }
    
}
