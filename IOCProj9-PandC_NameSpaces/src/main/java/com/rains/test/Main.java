package com.rains.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.Employee;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");
		Employee emp = ctx.getBean("com.rains.beans.Employee#1", Employee.class);
		System.out.println(emp);
		Employee emp2 = ctx.getBean("com.rains.beans.Employee#0", Employee.class);
		System.out.println(emp2);
		ctx.close();
	}

}
