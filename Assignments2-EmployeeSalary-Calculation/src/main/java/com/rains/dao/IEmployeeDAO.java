package com.rains.dao;

import com.rains.bo.EmployeeBO;

public interface IEmployeeDAO {
	String INSERT_EMPLOYEE_PROCEDURE = "{CALL FS_LAYERED_INSERT_EMPLOYEE(?,?,?,?,?,?)}";

	int insertEmployee(EmployeeBO bo) throws Exception;

}
