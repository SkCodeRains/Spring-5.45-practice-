package com.rains.beans;

public class Student {
	private int sNo;
	private String sName, sAddress;

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

}
