package com.swati.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swati.spring.model.Employee;
import java.util.List;
import com.swati.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired      //Field Injection
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    
}
