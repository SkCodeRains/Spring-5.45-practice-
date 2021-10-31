package com.rains.service;

import java.util.List;
import java.util.Map;

public interface IEmployeService {
	int fetchEmpsCount();

	String fetchEmpName(int id);

	Map<String, Object> fetchEmpDetailsByEmpNo(int eno);

	List<Map<String, Object>> fetchEmpDetailsByDesg(String... desg);

	String firedEmpWhoNotHavinDesg();

	String DepositSalaryWithBonus(String... desg);

	String registerEmployee(String name, String desg, float salary);

}
