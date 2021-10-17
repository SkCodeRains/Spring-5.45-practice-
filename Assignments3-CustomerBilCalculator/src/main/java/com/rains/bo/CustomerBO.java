package com.rains.bo;

public class CustomerBO {
	private String custName, custAddress;
	float time, rate, pAmt, intrest;

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

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
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

	public float getIntrest() {
		return intrest;
	}

	public void setIntrest(float intrest) {
		this.intrest = intrest;
	}

	@Override
	public String toString() {
		return "Detailse [custName=" + custName + ", custAddress=" + custAddress + ", time=" + time + ", rate=" + rate
				+ ", pAmt=" + pAmt + ", intrest=" + intrest + "]";
	}

}
