package com.spring.javaconfiguration2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.javaconfiguration2.Department;
import com.spring.bean.javaconfiguration2.Emp;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(IocAppJavaConfiguration.class);
		
		System.out.println("userObj = " + (Emp) appContext.getBean("userObj"));
		System.out.println("user2 = " + (Emp) appContext.getBean("user2"));
		System.out.println("newUser = " + (Emp) appContext.getBean("newUser"));
		
		Emp rajesh = (Emp) appContext.getBean("newUser");
		rajesh.setCity("Bucharest");
		System.out.println("rajesh = " + rajesh);
		
		System.out.println("salesDept = " + (Department) appContext.getBean("salesDept"));
		System.out.println("newDepartment = " + (Department) appContext.getBean("newDepartment"));
		
		appContext.close();
	}

}
