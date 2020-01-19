package com.example.metier;

import com.example.dao.EmployeeRepository;
import com.example.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeMetierImp implements EmployeMetier{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmploye(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public List<Employee> listEmployes() {
        return employeeRepository.findAll();
    }
}
