package com.rains.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.rains.model.Employee;
import com.rains.model.EmployeeFiller;
import com.rains.service.EmployeeMgmtServiceImpl;
import com.rains.service.IEmployeeMgmtService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");
		IEmployeeMgmtService service = ctx.getBean("empService", EmployeeMgmtServiceImpl.class);
		try {
			String name = service.fetchEmpByEmpNo(74992);
			System.out.println("the name of the employee is : " + name);
		} catch (EmptyResultDataAccessException erdae) {
			System.out.println("No data Found");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			List<Employee> list = service.fetchEmpDetailsByDesg("clerk", "manager", "salesman", "owner");
			list.forEach(System.out::println);
		} catch (EmptyResultDataAccessException erdae) {
			System.out.println("No data Found");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String res = service.addEmployee(new Employee(2, "shaikh", "developer", 99999));
			System.out.println(res);

		} catch (EmptyResultDataAccessException erdae) {
			System.out.println("No data Found");
		} catch (Exception e) {
			System.out.println(e);
		}
		ctx.close();
	}
}
