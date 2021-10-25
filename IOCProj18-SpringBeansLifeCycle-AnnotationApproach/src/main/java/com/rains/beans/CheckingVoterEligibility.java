package com.rains.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CheckingVoterEligibility {

	private String name, address;
	private int age;

	@SuppressWarnings("unused")
	private Date lastVerified;

	@PostConstruct
	public void myInit() {
		System.out.println("CheckingVoterEligibility.myInit() running");
		name = name.trim();
		address = address.trim();
		lastVerified = new Date();
		if (age <= 0 || name == null || name.length() == 0 || address == null || address.length() == 0) {
			throw new IllegalArgumentException("Enter Proper details");
		}
	}

	public void setName(String name) {
		System.out.println("CheckingVoterEligibility.setName()");
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

	@PreDestroy
	public void myDestroy() {
		System.out.println("CheckingVoterEligibility.myDestroy()  running");
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
