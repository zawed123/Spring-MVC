package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		
		B b=(B)context.getBean("bref");
		
		System.out.println(b.getY());
		
		A a=(A)context.getBean("aref");
		
		//System.out.println(a.getOb().getY());
		System.out.println(a);
	}

}
