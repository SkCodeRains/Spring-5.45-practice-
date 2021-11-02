package com.rains.service;

import java.util.List;

import com.rains.model.Employee;

public interface IEmployeeMgmtService {
	String fetchEmpByEmpNo(int eno);

	List<Employee> fetchEmpDetailsByDesg(String... desg);

	String addEmployee(Employee emp);
}
