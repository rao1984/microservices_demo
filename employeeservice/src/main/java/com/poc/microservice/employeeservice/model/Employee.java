package com.poc.microservice.employeeservice.model;

import java.io.Serializable;

public class Employee implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -5755456005374132940L;
public String employeeId;
public String name;
public String contactNo;
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}


}
