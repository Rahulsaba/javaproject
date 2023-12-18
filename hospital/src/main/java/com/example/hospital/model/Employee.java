package com.example.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name ="employee")
public class Employee {
	
	private Integer id;
	private String employeeName;
	private String mobileNumber;
	private boolean employeeStatus;
	private Integer age;
	private String roletype;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true, nullable =false)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "employee_name")
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Column(name ="mobile_number")
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Column(name ="employee_status")
	public boolean isEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	
	@Column(name="age")
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Column(name ="roletype")
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employeeName + ", mobile_number=" + mobileNumber
				+ ", employee_status=" + employeeStatus + ", age=" + age +", roletype" + roletype + "]";
		
	}
	
}
