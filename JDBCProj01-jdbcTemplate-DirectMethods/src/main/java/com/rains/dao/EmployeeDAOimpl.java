package com.rains.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOimpl implements IEmployeeDAO {
	private final String GET_EMPS_COUNT = "SELECT COUNT(*) FROM EMP";
	private final String GET_EMP_NAME_BY_EMPNO = "SELECT ENAME FROM EMP where empno=?";
	private final String GET_EMP_DETAILS_BY_EMPNO = "SELECT * FROM EMP WHERE EMPNO=?";
	private final String GET_EMP_DETAILS_BY_DESG = "SELECT * FROM EMP WHERE JOB IN (?,?,?)";
	private final String DEL_EMPS_BY_noDEPT = "DELETE FROM EMP WHERE DEPTNO IS NULL";
	private final String UPDATE_EMP_SALARY_BY_DESG = "UPDATE EMP SET SAL=SAL+? WHERE JOB IN (?,?)";
	private final String INSERT_EMPLOYEE = "INSERT INTO SYSTEM.EMP (EMPNO,ENAME,JOB,SAL) VALUES (SYSTEM.EMPLOYEE_SEQ.NEXTVAL,?,?,?)";
	JdbcTemplate jt;

	public EmployeeDAOimpl(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	@Override
	public int getEmpsCount() {
		int count = jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}

	@Override
	public String getEmpNameByEmpNo(int id) {
		return jt.queryForObject(GET_EMP_NAME_BY_EMPNO, String.class, id);
	}

	@Override
	public Map<String, Object> getEmpDetailsByEmpNo(int eno) {
		return jt.queryForMap(GET_EMP_DETAILS_BY_EMPNO, eno);

	}

	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String... desg) {
		return jt.queryForList((GET_EMP_DETAILS_BY_DESG), desg);
	}

	@Override
	public int delEmpByNoDesg() {
		int DeletesCounts = jt.update(DEL_EMPS_BY_noDEPT);
		return DeletesCounts;
	}

	@Override
	public int updateEmpSalByDesg(String... desg) {
		int UpdateCount = jt.update(UPDATE_EMP_SALARY_BY_DESG, desg);
		return UpdateCount;
	}

	@Override
	public int registerEmployee(String name, String desg, float salary) {
		int result = jt.update(INSERT_EMPLOYEE, name, desg, salary);
		return result;

	}

}
