package com.example;


import com.example.dao.EmployeeRepository;
import com.example.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionComptesApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {

		SpringApplication.run(GestionComptesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
