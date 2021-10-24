package com.rains.beans;

import java.util.Date;

public class CheckingVoterEligibility {

	private String name, address;
	private int age;

	@SuppressWarnings("unused")
	private Date lastVerified;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLastVerified(Date lastVerified) {
		this.lastVerified = lastVerified;
	}

	public void myInit() {
		name = name.trim();
		address = address.trim();
		lastVerified = new Date();
		if (age <= 0 || name == null || name.length() == 0 || address == null || address.length() == 0) {
			throw new IllegalArgumentException("Enter Proper details");
		}
	}

	public void myDestroy() {
		name = null;
		age = 0;
		address = null;
		lastVerified = null;
	}

	public String checkingelegibility() {
		if (age < 18)
			return name + " is not elegible for voting";
		else
			return name + " is elegible for voting";

	}
}
