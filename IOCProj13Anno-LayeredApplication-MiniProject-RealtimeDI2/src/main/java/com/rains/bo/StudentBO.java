package com.rains.bo;

public class StudentBO {

	private String sname, sadd, result;
	private int total;
	private float avg;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "StudentBO [sname=" + sname + ", sadd=" + sadd + ", result=" + result + ", total=" + total + ", avg="
				+ avg + "]";
	}

}
