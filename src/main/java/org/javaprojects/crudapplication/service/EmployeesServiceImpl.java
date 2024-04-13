package org.javaprojects.crudapplication.service;

import org.javaprojects.crudapplication.exception.RessourceNotFoundException;
import org.javaprojects.crudapplication.model.Employee;
import org.javaprojects.crudapplication.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    final EmployeesRepository employeesRepository;

    public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
        super();
        this.employeesRepository = employeesRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeesRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeesRepository.findById(id).orElseThrow(() ->
                new RessourceNotFoundException("Employee", "Id", id));
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeesRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Employee", "Id", id));

        existingEmployee.setFirstName((employee.getFirstName()));
        existingEmployee.setLastName((employee.getLastName()));
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setId(employee.getId());
        existingEmployee.setDepartement(employee.getDepartement());
        existingEmployee.setDateOfBirth(employee.getDateOfBirth());
        existingEmployee.setPosition(employee.getPosition());
        existingEmployee.setSalary(employee.getSalary());
        employeesRepository.save(existingEmployee);

        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeesRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Employee", "Id", id));
        employeesRepository.deleteById(id);

    }
}
