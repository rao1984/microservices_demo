package com.poc.microservice.employeeservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.microservice.employeeservice.model.Employee;

@RestController
public class EmployeeController {

	EmployeeController(){
		Employee employee = new Employee();
		employee.setEmployeeId("1"); 
		employee.setName("Test1");
		employee.setContactNo("1234567890");
		employeeMap.put("1", employee);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId("2"); 
		employee2.setName("Test2");
		employee2.setContactNo("2234567890");
		employeeMap.put("2", employee2);
	}
	
	private Map<String,Employee> employeeMap=new HashMap<String, Employee>();
	@RequestMapping("/employee/{employeeId}")
	public Employee byNumber(@PathVariable("employeeId") String employeeId) {
		
		return  employeeMap.get(employeeId);
	}
}
