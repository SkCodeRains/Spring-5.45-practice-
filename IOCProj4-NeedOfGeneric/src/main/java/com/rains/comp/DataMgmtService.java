package com.rains.comp;

public class DataMgmtService {
	public Person showData(String type) {
		if (type.equalsIgnoreCase("emp"))
			return new Employee();
		else if (type.equalsIgnoreCase("cust"))
			return new Customer();
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T showData(String type, Class<T> clazz) {
		if (type.equalsIgnoreCase("emp"))
			return (T) new Employee();
		else if (type.equalsIgnoreCase("cust"))
			return (T) new Customer();
		return null;
	}
}
