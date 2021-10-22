package com.rains.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("wmg")

@Component

@Scope("prototype")
//@Lazy // it will disbale preinstantiation of singleton scop bean

public class WishMessageGenerator {
	// Field Injection
	@Autowired
	private Date d;

	public WishMessageGenerator() {
		System.out.println("called");
	}

	@Autowired
	public WishMessageGenerator(@Qualifier("sd") Date d) {
		System.out.println(this.d);
		this.d = d;
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	@Autowired
	public void setD(Date d) {
		System.out.println("WishMessageGenerator.setD()");
		System.out.println(this.d);
		this.d = d;
	}

//Buisness logic 
	public String generateMessage(String user) {
		@SuppressWarnings("deprecation")
		int h = d.getHours();
		if (h < 12)
			return "Good Morning" + user;
		else if (h < 16)
			return "Good Afternoon" + user;
		else if (h < 20)
			return "Good Evening" + user;
		else
			return "Good Night Love YOU ! " + user;
	}
}
