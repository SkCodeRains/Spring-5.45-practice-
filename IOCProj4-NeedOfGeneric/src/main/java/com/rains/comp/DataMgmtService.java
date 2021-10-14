package com.rains.comp;

public class DataMgmtService {
	public Person showData(String type) {
		if (type.equalsIgnoreCase("emp"))
			return new Employee();
		else if (type.equalsIgnoreCase("cust"))
			return new Customer();
		return null;
	}
}
