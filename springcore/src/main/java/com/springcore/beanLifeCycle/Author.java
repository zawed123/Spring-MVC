package com.springcore.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Author implements InitializingBean, DisposableBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method author");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init ethod author");

	}

}
