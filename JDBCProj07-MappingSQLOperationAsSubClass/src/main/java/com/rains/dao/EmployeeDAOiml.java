package com.rains.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOiml implements IEmployeeDAO {
	private static String Get_EMPNAME_BY_EMPID = "SELECT ENAME FROM EMP WHERE EMPNO=?";
	private DataSource ds;
	private GetEmpNameByNo selectName;

	@Autowired
	public EmployeeDAOiml(DataSource ds) {
		this.ds = ds;
		new GetEmpNameByNo(ds, Get_EMPNAME_BY_EMPID);
	}

	@Override
	public String GetEmpByNo(int eno) {
		return selectName.findObject(eno);
	}

	private static class GetEmpNameByNo extends MappingSqlQuery<String> {

		public GetEmpNameByNo(DataSource ds, String query) {
			super(ds, query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}

		@Override
		protected String mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println(rowNum);
			return rs.getString(1);
		}

	}

}
