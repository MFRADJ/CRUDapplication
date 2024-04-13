package org.javaprojects.crudapplication.controller;

import org.javaprojects.crudapplication.model.Employee;
import org.javaprojects.crudapplication.service.EmployeesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    final EmployeesService employeesService;

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
    public List<Employee> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    // build get employee by id REST API
    // http://localhost:8080/api/employees/1
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId) {
        Employee employee = employeesService.getEmployeeById(employeeId);
        return ResponseEntity.ok().body(employee);
    }

    // build update employee by id REST API
    // http://localhost:8080/api/employees/1
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employeeDetails) {
        Employee updatedEmployee = employeesService.updateEmployee(employeeDetails, employeeId);
        return ResponseEntity.ok().body(updatedEmployee);
    }

    // build delete employee by id REST API
    // http://localhost:8080/api/employees/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") long employeeId) {
        employeesService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }
}
