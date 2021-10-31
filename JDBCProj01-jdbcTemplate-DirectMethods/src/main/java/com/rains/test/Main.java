package com.rains.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.service.EmployeeServiceimpl;
import com.rains.service.IEmployeService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com\\rains\\cfgs\\ApplicationContext.xml");

		IEmployeService emp = ctx.getBean("empService", EmployeeServiceimpl.class);
		try {
			System.out.println("Total No. of employees : " + emp.fetchEmpsCount());
			System.out.println("employee name : " + emp.fetchEmpName(7499));
		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			System.out.println(
					"++++======================================================================================++++");
			System.out.println("Employees Details By EmpNo 7499 " + emp.fetchEmpDetailsByEmpNo(7499));
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

			System.out.println(
					"++++================================================================================++++");
			System.out.println("Employees Details By desg ");

			List<Map<String, Object>> emplist = emp.fetchEmpDetailsByDesg("MANAGER");
			emplist.forEach(map -> {
				System.out.println(map);
			});
		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			System.out.println(
					"++++================================================================================++++");
			System.out.println("Employees Deleted By desg ");
			String results = emp.firedEmpWhoNotHavinDesg();
			System.out.println(results);

		} catch (Exception e) {
			System.out.println(e);
		}

//		try {
//
//			System.out.println(
//					"++++================================================================================++++");
//			System.out.println("Employees updates salary by desg ");
//			String results = emp.DepositSalaryWithBonus("10000", "clerk", "salesman");
//			System.out.println(results);
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		try {

			System.out.println(
					"++++================================================================================++++");
			System.out.println("Employees Registring ");
			String results = emp.registerEmployee("Rains", "owner", 99999);
			System.out.println(results);
		} catch (Exception e) {
			System.out.println(e);
		}
		ctx.close();

	}
}
