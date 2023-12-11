package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneConfig.xml");
		Person person1 = con.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeesStructure());
		System.out.println(person1.getFeesStructure().getClass().getName());
		System.out.println(person1.getProperties());

	}
}
