package com.swati.first_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.swati.first_project.model.Employee;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeController {

    List<Employee> list = new ArrayList<>();

   @GetMapping("hi")
    String hello() {
        return "Hello Employee";
    }

    @PostMapping("save")
    public Employee addEmp(@RequestBody Employee emp) {
        list.add(emp);
        return emp;
    }
    
    @GetMapping("getAll")
    List<Employee> getAllEmp(){
        return list;
    }
    
}
