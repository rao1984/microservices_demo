package com.poc.microservice.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebEmployeeController {
	@Autowired
	private WebEmployeeService employeeService;
	@RequestMapping("/employee/{employeeId}")
	public Employee byNumber(@PathVariable("employeeId") String employeeId) {
		return employeeService.findById(employeeId);
	}
}
