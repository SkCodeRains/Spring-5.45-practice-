package com.rains.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.rains.model.Employee;

@SuppressWarnings("unused")
@Repository("empDao")
public class EmployeeDAOimpl implements IEmployeeDAO {

	private final String GET_EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?)";

	private final String DEL_EMPS_BY_noDEPT = "DELETE FROM EMP WHERE DEPTNO IS NULL";
	private final String UPDATE_EMP_SALARY_BY_DESG = "UPDATE EMP SET SAL=SAL+? WHERE JOB IN (?,?)";
	private final String INSERT_EMPLOYEE = "INSERT INTO SYSTEM.EMP (EMPNO,ENAME,JOB,SAL) VALUES (SYSTEM.EMPLOYEE_SEQ.NEXTVAL,?,?,?)";

	private static final String GET_EMP_BY_EMPNO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=? ";

	@Autowired
	JdbcTemplate jt;

	//inner anonymous class lambda expression row map single row
	@Override
	public Employee getEmpDetailsById(int eno) {
		return jt.queryForObject(GET_EMP_BY_EMPNO, (rs, rn) -> {
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			emp.setDeptno(rs.getInt(5));
			return emp;
		}

				, eno);
	}

	// RowMapper as Anonymous inner class Lambda expression
	@Override
	public List<Employee> getEmpDetailsByDesg(String... desg) {
		return jt.queryForObject(GET_EMP_DETAILS_BY_DESG, (rs, rn) -> {
			List<Employee> employees = new ArrayList<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDeptno(rs.getInt(5));
				employees.add(emp);
			}
			return employees;
		}, desg);
	}

// resultset extractor with inner class and inner anonymous lambda expression class
	@Override
	public List<Employee> getEmpDetailsByDesgRS(String... desg) {
//		return jt.query(GET_EMP_DETAILS_BY_DESG, rs -> {
//			List<Employee> employees = new ArrayList<Employee>();
//			while (rs.next()) {
//				Employee emp = new Employee();
//				emp.setEmpno(rs.getInt(1));
//				emp.setEname(rs.getString(2));
//				emp.setJob(rs.getString(3));
//				emp.setSal(rs.getFloat(4));
//				emp.setDeptno(rs.getInt(5));
//				employees.add(emp);
//			}
//			return employees;
//		}, desg);

		return jt.query(GET_EMP_DETAILS_BY_DESG, new employeeExtractor(), desg);
	}
// Extractor inner class
	private class employeeExtractor implements ResultSetExtractor<List<Employee>> {

		
		
		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Employee> employees = new ArrayList<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDeptno(rs.getInt(5));
				employees.add(emp);
			}
			return employees;
		}

	}

	// anonymous Innerclass same operation
//	@Override
//	public Employee getEmpDetailsById(int eno) {
//		return jt.queryForObject(GET_EMP_BY_EMPNO, new RowMapper<Employee>() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee emp = new Employee();
//				emp.setEmpno(rs.getInt(1));
//				emp.setEname(rs.getString(2));
//				emp.setJob(rs.getString(3));
//				emp.setSal(rs.getFloat(4));
//				emp.setDeptno(rs.getInt(5));
//				return emp;
//			}
//
//		}, eno);
//	}


//	@Override
//	public Employee getEmpDetailsById(int eno) {
//		Employee emp = jt.queryForObject(GET_EMP_BY_EMPNO, new EmployeeMapper(), eno);
//		return emp;
//	}
//
//	//Inner Class (call back interface) 
//	private class EmployeeMapper implements RowMapper<Employee> {
//
//		private EmployeeMapper() {
//			System.out.println("called");
//		}
//
//		@Override
//		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Employee emp = new Employee();
//			emp.setEmpno(rs.getInt(1));
//			emp.setEname(rs.getString(2));
//			emp.setJob(rs.getString(3));
//			emp.setSal(rs.getFloat(4));
//			emp.setDeptno(rs.getInt(5));
//			return emp;
//		}
//	}

}
