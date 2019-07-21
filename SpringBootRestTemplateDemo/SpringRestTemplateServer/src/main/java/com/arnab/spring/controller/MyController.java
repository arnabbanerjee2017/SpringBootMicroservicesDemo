package com.arnab.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.entity.Employee;
import com.arnab.spring.service.MyService;

@RestController
@RequestMapping(value = "/emp")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		return service.getEmployee();
	}
	
}
