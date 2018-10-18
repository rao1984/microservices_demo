package com.poc.microservice.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class WebEmployeeServer {
public static void main(String[] args) {
	System.setProperty("spring.config.name", "web-server");

	SpringApplication.run(WebEmployeeServer.class, args);
}
@LoadBalanced
@Bean
RestTemplate restTemplate() {
	return new RestTemplate();
}

}
