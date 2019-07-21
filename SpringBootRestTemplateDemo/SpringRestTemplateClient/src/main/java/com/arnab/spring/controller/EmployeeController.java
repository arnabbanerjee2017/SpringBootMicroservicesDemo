package com.arnab.spring.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.arnab.spring.entity.Employee;
import com.arnab.spring.service.EmployeeService;

@RestController
@RequestMapping(value = "/myemp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() throws RestClientException, URISyntaxException {
		return service.getEmployee();
	}
	
}
