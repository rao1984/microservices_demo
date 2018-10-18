package com.poc.microservice.webservice;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WebEmployeeService {
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	protected Logger logger = Logger.getLogger(WebEmployeeService.class
			.getName());
	protected String serviceUrl="http://EMPLOYEE-SERVICE";
	

	public Employee findById(String employeeId) {

		logger.info("findById() invoked: for " + employeeId);
		return restTemplate.getForObject(serviceUrl + "/employee/{employeeId}",
				Employee.class, employeeId);
	}

}
