package com.arnab.spring.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.arnab.spring.entity.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee() throws RestClientException, URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		Employee emp = restTemplate.getForObject(new URI("http://localhost:8081/emp/get"), Employee.class);		
		return emp;
	}
	
}
