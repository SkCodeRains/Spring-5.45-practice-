package com.rains.bo;

public class EmployeeBO {

	private String eName, eAddress;
	private float grossSal, netSal, eSal;

	public float getGrossSal() {
		return grossSal;
	}

	public void setGrossSal(float grossSal) {
		this.grossSal = grossSal;
	}

	public float getNetSal() {
		return netSal;
	}

	public void setNetSal(float netSal) {
		this.netSal = netSal;
	}

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

	public float geteSal() {
		return eSal;
	}

	public void seteSal(float eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eName=" + eName + ", eAddress=" + eAddress + ", eSal=" + eSal + ", grossSal=" + grossSal
				+ ", netSal=" + netSal + "]";
	}

}
