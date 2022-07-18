package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/steroconfig.xml");
		Student student = context.getBean("studentObject", Student.class);
		System.out.println(student);

		System.out.println(student.getState());
		System.out.println(student.hashCode());
		Student student2 = context.getBean("studentObject", Student.class);
		System.out.println(student2.hashCode());

		System.out.println("--Teacher hash code----");
		Teacher t1 = (Teacher) context.getBean("teacher", Teacher.class);
		Teacher t2 = (Teacher) context.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}
}
