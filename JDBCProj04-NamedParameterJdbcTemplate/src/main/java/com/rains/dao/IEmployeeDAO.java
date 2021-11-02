package com.rains.dao;

import java.util.List;

import com.rains.model.Employee;

public interface IEmployeeDAO {
	String GET_EMP_NAME_BY_EMPNO = "SELECT ENAME FROM EMP WHERE EMPNO=:no";
	String GET_EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN (:d1,:d2,:d3)";
	String INSERT_EMPLOYEE = "INSERT INTO EMP (EMPNO,ENAME,JOB,SAL)VALUES (:empno,:ename,:job,:sal)";

	String getEmpNameByNo(int eno);

	List<Employee> getEmpDetailsByDesg(String... desg);

	int insertEmployee(Employee emp);
}
