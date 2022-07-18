package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean
	public Department getDepartment()
	{
		return new Department();
	}
	@Bean(name= {"student","temp","con"})
	public Student getStudent()
	{
	  Student student=new Student(getDepartment());
	  
	  return student;
	  
	}

}
