package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "student_name")
	private String student_Name;
	@Column(name = "student_city")
	private String studentCity;

	public Student(int studentId, String student_Name, String studentCity) {
		this.studentId = studentId;
		this.student_Name = student_Name;
		this.studentCity = studentCity;
	}

	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

}
