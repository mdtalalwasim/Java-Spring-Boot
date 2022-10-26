package com.springcore.reference_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference_inject/refconfig.xml");
		A a = (A) context.getBean("refA");
		
		System.out.println(a);
		
		
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		
	
	}

}
