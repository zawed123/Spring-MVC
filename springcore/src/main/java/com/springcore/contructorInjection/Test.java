package com.springcore.contructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/contructorInjection/ciconfig.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);

		Addition addition = (Addition) context.getBean("addition");
		addition.doSum();

	}

}
