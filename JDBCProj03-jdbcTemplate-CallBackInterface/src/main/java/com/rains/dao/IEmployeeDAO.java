package com.rains.dao;

import java.util.List;

import com.rains.model.Employee;

public interface IEmployeeDAO {
	List<Employee> getEmpDetailsByDesg(String... desg);

	List<Employee> getEmpDetailsByDesgRS(String... desg);

	Employee getEmpDetailsById(int eno);

}
