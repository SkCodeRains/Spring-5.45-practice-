package com.rains.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rains.model.Employee;

@Repository("empDAO")
public class EmployeeDAOiml implements IEmployeeDAO {
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	@Override
	public String getEmpNameByNo(int eno) {
		Map<String, Object> paramMap = Map.of("no", eno);
		String name = npjt.queryForObject(GET_EMP_NAME_BY_EMPNO, paramMap, String.class);
		return name;
	}

	@Override
	public List<Employee> getEmpDetailsByDesg(String... desg) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		int i = 0;
		for (String string : desg) {
			i++;
			System.out.println(string);
			source.addValue("d" + i, string);
		}

		return npjt.query(GET_EMP_DETAILS_BY_DESG, source, rs -> {
			List<Employee> list = new ArrayList<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				list.add(emp);
			}
			return list;
		});
	}

	@Override
	public int insertEmployee(Employee emp) {
		BeanPropertySqlParameterSource src = new BeanPropertySqlParameterSource(emp);
		return npjt.update(INSERT_EMPLOYEE, src);
	}

}
