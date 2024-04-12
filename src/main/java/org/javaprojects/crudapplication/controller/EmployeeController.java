package org.javaprojects.crudapplication.controller;

import org.javaprojects.crudapplication.model.Employee;
import org.javaprojects.crudapplication.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeesRepository employeesRepository;
    // get all employees
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }
}
