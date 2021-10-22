package com.rains.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.WishMessageGenerator;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext2.xml");
		// WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
//		WishMessageGenerator wmg = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
//		WishMessageGenerator wmg2 = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
//		WishMessageGenerator wmg3 = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		// System.out.println(wmg.generateMessage("King"));
		ctx.close();
	}

}
