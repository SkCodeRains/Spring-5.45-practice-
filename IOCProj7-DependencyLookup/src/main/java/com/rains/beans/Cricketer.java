package com.rains.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	public Cricketer() {
		System.out.println("Cricketer 0 Const");
	}

	public void bowling() {
		System.out.println("cricketer is bowling");

	}

	public void feilding() {
		System.out.println("cricketer is feilding");

	}

	public void wicketKeeping() {
		System.out.println("cricketer is keeping wickets");

	}

	public void batting() {
		System.out.println("crickter is batting");
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/rains/cfgs/ApplicationContext.xml");
		Bat bat = factory.getBean("bat", Bat.class);
		System.out.println("cricketer score " + bat.scoreRuns());

	}
}
