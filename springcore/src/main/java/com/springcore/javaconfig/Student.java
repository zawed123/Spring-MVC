package com.springcore.javaconfig;

public class Student {

	private Department department;

	public Student(Department department) {
		super();
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void study() {
		System.out.println("I am B.Tech Student");
	}
}
