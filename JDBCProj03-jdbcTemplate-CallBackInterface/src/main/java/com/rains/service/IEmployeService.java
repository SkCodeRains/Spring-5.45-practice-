package com.rains.service;

import java.util.List;
import java.util.Map;

import com.rains.model.Employee;

public interface IEmployeService {
//	int fetchEmpsCount();
//
//	String fetchEmpName(int id);
	Employee fetchEmpDetailsByEmpNo(int eno);

	List<Employee> fetchEmpDetailsByDesg(String... desg);

	List<Employee> fetchEmpDetailsByDesgRS(String... desg);
//
//	String firedEmpWhoNotHavinDesg();
//
//	String DepositSalaryWithBonus(String... desg);
//
//	String registerEmployee(String name, String desg, float salary);

}
