package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

import com.example.hospital.service.EmployeeService;
import com.example.hospital.dto.EmployeeDto;
import com.example.hospital.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController{
	
	private final EmployeeService empService;
	@Autowired
	public EmployeeController(EmployeeService empService) {
		this.empService =empService;
	}
	
	@PostMapping(path = "/addemployee",produces ="application/json")
	public void addemployee(@valid @RequestBody Employee addemployee){
		try {
				empService.addemployee(addemployee);
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	@GetMapping(path ="/getemployee")
	@ApiOperation(value="get employee details")
	public List<Employee> getemployeedetails(){
		return empService.getEmployeeDetails();
	}
	
}