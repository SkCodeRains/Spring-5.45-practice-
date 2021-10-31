package com.rains.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
	int getEmpsCount();

	String getEmpNameByEmpNo(int id);

	Map<String, Object> getEmpDetailsByEmpNo(int eno);

	List<Map<String, Object>> getEmpDetailsByDesg(String... desg);

	int delEmpByNoDesg();

	int updateEmpSalByDesg(String... desg);

	int registerEmployee(String name, String desg, float salary);

}
