package com.arnab.spring.service;

import org.springframework.stereotype.Service;

import com.arnab.spring.entity.Employee;

@Service
public class MyService {

	public Employee getEmployee() {
		return new Employee(1, "John Snow", "Boston", "Developer", "Internal");
	}
	
}
