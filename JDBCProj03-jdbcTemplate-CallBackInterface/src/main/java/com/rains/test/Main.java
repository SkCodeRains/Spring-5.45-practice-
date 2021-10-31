package com.rains.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rains.model.Employee;
import com.rains.service.IEmployeService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com\\rains\\cfgs\\ApplicationContext.xml");
		IEmployeService service = ctx.getBean("empService", IEmployeService.class);

		System.out.println(IEmployeService.class);

		try {
			Employee emp = service.fetchEmpDetailsByEmpNo(7499);
			System.out.println(emp);
		} catch (DataAccessException e) {
			System.out.println(e);
		}

		try {
			System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			List<Employee> emp = service.fetchEmpDetailsByDesg("MANAGER", "SALESMAN");
			emp.forEach(emp2 -> System.out.println(emp2));
			System.out.println("\n\n Pring by Method refrence");
			emp.forEach(System.out::println);

		} catch (DataAccessException e) {
			System.out.println(e);
		}

		try {
			System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			List<Employee> emp = service.fetchEmpDetailsByDesgRS("MANAGER", "SALESMAN", "CLERK");
			emp.forEach(emp2 -> System.out.println(emp2));
			System.out.println("\n\n Printing by Method refrence");
			emp.forEach(System.out::println);

		} catch (DataAccessException e) {
			System.out.println(e);
		}
		ctx.close();

	}
}
