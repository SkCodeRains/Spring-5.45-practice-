package com.rains.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckingVoterEligibility implements InitializingBean, DisposableBean {

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

	public String checkingelegibility() {
		if (age < 18)
			return name + " is not elegible for voting";
		else
			return name + " is elegible for voting";

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("CheckingVoterEligibility.destroy()");
		name = null;
		age = 0;
		address = null;
		lastVerified = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("CheckingVoterEligibility.afterPropertiesSet()");
		name = name.trim();
		address = address.trim();
		lastVerified = new Date();
		if (age <= 0 || name == null || name.length() == 0 || address == null || address.length() == 0) {
			throw new IllegalArgumentException("Enter Proper details");
		}
	}
}
