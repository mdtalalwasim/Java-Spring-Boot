package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/personconfig.xml");
//	 Person p =(Person) context.getBean("person");

//	 System.out.println(p);
	 
	 System.out.println("--------------------");
	 Person p2 =(Person) context.getBean("person2");
	 System.out.println(p2);
	 
	}

}
