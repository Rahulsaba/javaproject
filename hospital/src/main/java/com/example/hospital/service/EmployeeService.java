package com.example.hospital.service;

import java.util.List;

import com.example.hospital.model.Employee;

import jakarta.validation.Valid;

public interface EmployeeService {
	
	void addemployee(@Valid Employee addemployee);
	List<Employee> getEmployeeDetails();
	

}
