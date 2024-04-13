package org.javaprojects.crudapplication.controller;

import org.javaprojects.crudapplication.model.Employee;
import org.javaprojects.crudapplication.repository.EmployeesRepository;
import org.javaprojects.crudapplication.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
   private EmployeesService employeesService;

    public EmployeeController(EmployeesService employeesService) {
        super();
        this.employeesService = employeesService;
    }
    //build create employee REST API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeesService.saveEmployee(employee), HttpStatus.CREATED);
    }
    // build get all employees REST API
    @GetMapping()
    public ResponseEntity<Employee> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

}
