package com.arnab.spring.entity;

public class Employee {

	private int id;
	private String name;
	private String city;
	private String role;
	private String project;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String city, String role, String project) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.role = role;
		this.project = project;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", role=" + role + ", project=" + project
				+ "]";
	}

}
