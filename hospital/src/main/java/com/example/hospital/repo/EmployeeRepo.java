package com.example.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.hospital.model.Employee;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@Query("SELECT e FROM #{#entityName} e")
	List<Employee> getEmployeeDetails();
}
