package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentObject")
//@Scope("prototype")
public class Student {

	@Value("Amit Kumar")
	private String Name;
	@Value("Kolkata")
	private String city;
	
	@Value("#{stateName}")
	private List<String> state;

	public List<String> getState() {
		return state;
	}

	public void setState(List<String> state) {
		this.state = state;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", city=" + city + "]";
	}
}
