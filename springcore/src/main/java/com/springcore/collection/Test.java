package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	   ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
       Employee employee=(Employee) context.getBean("employee1");
       
       System.out.println(employee.getName());
       System.out.println(employee.getPhone());
       System.out.println(employee.getAddress());
       System.out.println(employee.getCourses());
       System.out.println(employee.getProps());
	}

}
