package com.springcore_test.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpMain {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_test/collections/collectionconfig.xml");
	Employees emp1 = (Employees) context.getBean("employee1");
	System.out.println(emp1.getEmpName());
	System.out.println(emp1.getEmpPhoneNumbers());
	System.out.println(emp1.getEmpAddresses());
	System.out.println(emp1.getEmpCourses());
	System.out.println(emp1.getProps());
	
	
	}

}
