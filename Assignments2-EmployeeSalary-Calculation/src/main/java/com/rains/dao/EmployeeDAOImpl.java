package com.rains.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import javax.sql.DataSource;

import com.rains.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println(bo);
		Connection con = null;
		CallableStatement cst = null;
		int result = 0;
		try {
			con = ds.getConnection();
			cst = con.prepareCall(INSERT_EMPLOYEE_PROCEDURE);
			cst.setString(1, bo.geteName());
			cst.setString(2, bo.geteAddress());
			cst.setFloat(3, bo.geteSal());
			cst.setFloat(4, bo.getGrossSal());
			cst.setFloat(5, bo.getNetSal());
			cst.registerOutParameter(6, Types.INTEGER);
			cst.execute();
			result = cst.getInt(6);
		} catch (Exception e) {
			System.out.println("EmployeeDAOImpl.insertEmployee()");
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (cst != null)
					cst.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

}
