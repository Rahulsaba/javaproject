package com.example.hospital.dto;

import jakarta.validation.constraints.NotNull;

public class  EmployeeDto{
	private Integer id;
	private String employeeName;
	@NotNull(message ="employeeName is Mandatory")
	private String mobileNumber;
	@NotNull(message ="Mobilenumber is Mandatory")
	private boolean employeeStatus;
	private String roletype;
	private Integer age;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
