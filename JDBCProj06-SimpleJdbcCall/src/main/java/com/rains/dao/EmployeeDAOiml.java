package com.rains.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.rains.model.Employee;

@Repository("empDAO")
public class EmployeeDAOiml implements IEmployeeDAO {
	@Autowired
	private SimpleJdbcCall sjc;

	@Override
	public int insert(Employee emp) {
		sjc.setProcedureName("INSERT_EMPLOYEE");
		BeanPropertySqlParameterSource bpsps = new BeanPropertySqlParameterSource(emp);
		Map<String, Object> rs = sjc.execute(bpsps);
		// byte[] arr=(byte[]) rs.get("");
		return (int) rs.get("RESULTS");

	}

}
