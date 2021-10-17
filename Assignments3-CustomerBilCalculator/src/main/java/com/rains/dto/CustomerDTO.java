package com.rains.dto;

public class CustomerDTO {
	private String custName, custAddress;
	float rate, pAmt, time;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getpAmt() {
		return pAmt;
	}

	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custName=" + custName + ", custAddress=" + custAddress + ", rate=" + rate + ", pAmt="
				+ pAmt + ", time=" + time + "]";
	}

}
