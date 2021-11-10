package com.rains.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rains.beans.WishMessageGenerator;
import com.rains.config.AppConfig;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator msg = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(msg.generateWishMessage("King "));
		ctx.close();
	}
}
