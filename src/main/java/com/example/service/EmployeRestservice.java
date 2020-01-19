package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.metier.EmployeMetier;

@RestController
public class EmployeRestservice {
	@Autowired
	private EmployeMetier employeMetier;
	@PostMapping(value = "/employes")
	public Employee saveEmploye(@RequestBody Employee e) {
		return employeMetier.saveEmploye(e);
	}
	@GetMapping(value = "/employes")
	public List<Employee> listEmployes() {
		return employeMetier.listEmployes();
	}

}
