package com.rains.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rains.service.EmployeeMgmtServiceImpl;
import com.rains.service.IEmployeeMgmtService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");
		IEmployeeMgmtService service = ctx.getBean("empService", EmployeeMgmtServiceImpl.class);

		try {
			IEmployeeMgmtService svc = ctx.getBean("empService", IEmployeeMgmtService.class);
			String result = svc.GetEmpNameById(7499);
			System.out.println(result);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		ctx.close();
	}
}
