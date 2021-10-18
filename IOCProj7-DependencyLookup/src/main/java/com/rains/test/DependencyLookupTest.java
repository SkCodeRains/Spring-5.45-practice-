package com.rains.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.Cricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/rains/cfgs/ApplicationContext.xml");
		Cricketer k = ctx.getBean("cricket", Cricketer.class);
		k.batting();
		k.bowling();
		k.feilding();
	}
}
