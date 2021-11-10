package com.rains.test;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rains.model.Employee;
import com.rains.service.EmployeeMgmtServiceImpl;
import com.rains.service.IEmployeeMgmtService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");
		@SuppressWarnings("unused")
		IEmployeeMgmtService service = ctx.getBean("empService", EmployeeMgmtServiceImpl.class);

		try {
			IEmployeeMgmtService svc = ctx.getBean("empService", IEmployeeMgmtService.class);
			String result = svc
					.registerEmployee(new Employee(new Random().nextInt(1000), "Shaikh", "Developer", 9999));
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		ctx.close();
	}
}
