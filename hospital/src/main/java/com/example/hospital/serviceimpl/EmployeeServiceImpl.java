package com.example.hospital.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospital.model.Employee;
import com.example.hospital.service.EmployeeService;
import com.example.hospital.repo.EmployeeRepo;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeerepo;
	
	@Transactional
	@Override
	public void addemployee(@Valid Employee addemployee) {
		try {
			 employeerepo.save(addemployee);
		}
		catch(Exception e) {
				throw e;
			}
	}
	
	@Override
	public List<Employee> getEmployeeDetails(){
		try {
			return employeerepo.getEmployeeDetails();
		}
		catch(Exception e){
			throw e;
		}
	}
	
}
