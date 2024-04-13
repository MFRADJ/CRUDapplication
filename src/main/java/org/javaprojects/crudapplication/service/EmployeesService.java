package org.javaprojects.crudapplication.service;

import org.javaprojects.crudapplication.model.Employee;

import java.util.List;

public interface EmployeesService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
