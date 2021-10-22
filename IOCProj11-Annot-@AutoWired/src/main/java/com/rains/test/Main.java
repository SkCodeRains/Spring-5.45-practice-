package com.rains.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.WishMessageGenerator;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");
		WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg.generateMessage("King"));
		ctx.close();
	}

}
