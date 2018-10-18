package com.poc.microservice.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EmployeeServer {
public static void main(String[] args) {
	System.setProperty("spring.config.name", "employee-server");

	SpringApplication.run(EmployeeServer.class, args);
}
	
}
