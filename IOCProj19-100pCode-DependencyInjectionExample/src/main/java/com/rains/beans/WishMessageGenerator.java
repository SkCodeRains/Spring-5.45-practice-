package com.rains.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;

	public String generateWishMessage(String user) {
		int hour = ldt.getHour();
		if (hour < 20)
			return "good morning " + user;
		else if (hour < 20)
			return "good afternoon " + user;
		else if (hour < 20)
			return "good evening " + user;
		else
			return "good night" + user;

	}

}
