package com.rains.zrun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.PersonalInfo;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");

		PersonalInfo p = ctx.getBean("p4", PersonalInfo.class);
		System.out.println(p);
		ctx.close();
	}
}
