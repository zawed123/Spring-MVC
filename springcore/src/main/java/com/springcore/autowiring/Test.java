package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/autowiring/autowireconfig.xml");
		
		Employee employee=(Employee) context.getBean("employee",Employee.class);
		System.out.println(employee);
	}

}
