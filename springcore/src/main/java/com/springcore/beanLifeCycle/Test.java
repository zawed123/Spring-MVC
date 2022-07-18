package com.springcore.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/beanLifeCycle/beanlifeconfig.xml");

		Book book = (Book) context.getBean("book");

		System.out.println(book);

		context.registerShutdownHook();

		Author author = (Author) context.getBean("author");
		System.out.println(author);

		Publication publiction = (Publication) context.getBean("publication");
		System.out.println(publiction);
	}
}
