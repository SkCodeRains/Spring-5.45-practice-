package com.rains.test;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rains.model.Employee;
import com.rains.service.IEmployeeMgmtService;

public class Main {
	static ClassPathXmlApplicationContext ctx;
	static {
		ctx = new ClassPathXmlApplicationContext("com/rains/cfgs/ApplicationContext.xml");
	};
	@Autowired
	private IEmployeeMgmtService svc;

	public static void main(String[] args) {

		new Main().test();

	}

	void test() {
		try {
			String result = svc.registerEmployee(new Employee(new Random().nextInt(1000), "Shaikh", "Developer", 9999));
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}
}
