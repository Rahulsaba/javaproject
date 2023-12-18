package com.example.hospital.dao;


import org.springframework.stereotype.Repository;
import com.example.hospital.model.Employee;

import jakarta.validation.Valid;

@Repository
public interface EmployeeDao {

	public String persist(@Valid Employee addemployee);
}
