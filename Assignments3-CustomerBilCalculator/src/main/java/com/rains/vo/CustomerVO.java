package com.rains.vo;

public class CustomerVO {
	private String custName, custAddress, pAmt, rate, time;

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

	public String getpAmt() {
		return pAmt;
	}

	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "EmployeeVO [custName=" + custName + ", custAddress=" + custAddress + ", pAmt=" + pAmt + ", rate=" + rate
				+ ", time=" + time + "]";
	}

}
