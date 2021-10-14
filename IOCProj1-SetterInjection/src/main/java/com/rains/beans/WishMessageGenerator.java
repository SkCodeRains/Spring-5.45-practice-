package com.rains.beans;

import java.util.Date;

public class WishMessageGenerator {
	// field
	private Date d;

// setter Method
	public void setDate(Date d) {
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
