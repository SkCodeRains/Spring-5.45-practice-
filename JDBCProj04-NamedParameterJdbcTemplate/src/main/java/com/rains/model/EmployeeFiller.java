package com.rains.model;

import java.util.Scanner;

public class EmployeeFiller {

	public Employee fill(Employee emp) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Insert Employee No     : ");
			emp.setEmpno(Integer.parseInt(sc.nextLine()));
			System.out.print("Insert Employee Name   : ");
			emp.setEname(sc.nextLine());
			System.out.print("Insert Employee job    : ");
			emp.setJob(sc.nextLine());
			System.out.print("Insert Employee sal    : ");
			emp.setSal(Float.parseFloat((sc.nextLine())));
		}
		return emp;
	}
}
