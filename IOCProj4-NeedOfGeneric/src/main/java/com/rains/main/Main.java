package com.rains.main;

import com.rains.comp.Customer;
import com.rains.comp.DataMgmtService;
import com.rains.comp.Employee;
import com.rains.comp.Person;

public class Main {
	public static void main(String[] args) {
		DataMgmtService service = new DataMgmtService();
		Person p = service.showData("cust");
		Employee ee = (Employee) p;
		System.out.println("salary is :: " + ee.getEmpSalary());
	}
}
