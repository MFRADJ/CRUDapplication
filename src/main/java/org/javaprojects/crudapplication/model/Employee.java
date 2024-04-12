package org.javaprojects.crudapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false,length = 50)
    private String FirstName;
    @Column(name = "last_name", nullable = false,length = 50)
    private String LastName;
    @Column(name = "email", nullable = false,length = 50)
    private String Email;
    @Column(name = "date_of_birth", nullable = false,length = 50)
    private LocalDate dateOfBirth;
    @Column(name = "departement", nullable = false,length = 50)
    private String departement;
    @Column(name = "position", nullable = false,length = 50)
    private String position;
    @Column(name = "salary", nullable = false,length = 50)
    private double salary;
}
