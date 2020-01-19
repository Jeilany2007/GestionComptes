package com.example.metier;

import com.example.entities.Employee;

import java.util.List;

public interface EmployeMetier {
    public Employee saveEmploye(Employee e);
    public List<Employee> listEmployes();
}
