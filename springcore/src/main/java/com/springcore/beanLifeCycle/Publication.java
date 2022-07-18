package com.springcore.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Publication {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Publication [name=" + name + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Setting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}

}
