package com.rains.beans;

public class Student {
	private int sNo;
	private String sName, sAddress;

	public void setSNo(int sNo) {
		this.sNo = sNo;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public void setSAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

}
