package com.rains.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.rains.model.Employee;

@Repository("empDAO")
public class EmployeeDAOiml implements IEmployeeDAO {
	@Autowired
	private SimpleJdbcInsert sji;

//	@Override
//	public int insert(Employee emp) {
//		sji.setTableName("emp");
//		Map<String, Object> colMap = Map.of("EMPNO", emp.getEmpno(), "ename", emp.getEname(), "job", emp.getJob(),
//				"sal", emp.getSal());
//		return sji.execute(colMap);
//
//	}

//	@Override
//	public int insert(Employee emp) {
//		sji.setTableName("emp");
//		MapSqlParameterSource msps = new MapSqlParameterSource();
//		msps.addValue("empno", emp.getEmpno());
//		msps.addValue("ename", emp.getEname());
//		msps.addValue("job", emp.getJob());
//		msps.addValue("sal", emp.getSal());
//		return sji.execute(msps);
//	}

	@Override
	public int insert(Employee emp) {
		sji.setTableName("emp");
		BeanPropertySqlParameterSource bpsps = new BeanPropertySqlParameterSource(emp);
		return sji.execute(bpsps);

	}

}
