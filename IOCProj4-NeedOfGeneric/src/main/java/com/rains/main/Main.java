package com.rains.main;

import com.rains.comp.Customer;
import com.rains.comp.DataMgmtService;
import com.rains.comp.Employee;

public class Main {
	public static void main(String[] args) {

		DataMgmtService service = new DataMgmtService();
//		Person p = service.showData("cust");
//		Employee ee = (Employee) p;

		Employee emp = service.showData("emp", Employee.class);

		System.out.println("salary is :: " + emp.getEmpSalary());
		System.out.println("Bill is :: " + emp.getBillAmount());

		Customer cust = service.showData("cust", Customer.class);

		System.out.println("Employee salary : " + cust.getEmpSalary());
		System.out.println("Customer name is :: " + cust.getCustName());
	}
}
