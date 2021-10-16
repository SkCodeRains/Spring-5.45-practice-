package com.rains.vo;

public class EmployeeVO {
	private String eName, eAddress, eSal;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public String geteSal() {
		return eSal;
	}

	public void seteSal(String eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "EmployeeVO [eName=" + eName + ", eAddress=" + eAddress + ", eSal=" + eSal + "]";
	}

}
