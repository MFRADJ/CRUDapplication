package org.javaprojects.crudapplication.repository;

import org.javaprojects.crudapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee,Long> {
}
