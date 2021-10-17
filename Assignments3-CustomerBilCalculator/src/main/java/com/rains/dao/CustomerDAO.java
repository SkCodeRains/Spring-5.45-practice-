package com.rains.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import javax.sql.DataSource;

import com.rains.bo.CustomerBO;

public class CustomerDAO implements ICustomerDAO {

	DataSource drds;

	public CustomerDAO(DataSource drds) {
		super();
		this.drds = drds;
	}

	@Override
	public int insertCustomer(CustomerBO bo) throws Exception {
		Connection con = null;
		CallableStatement cst = null;
		int result = 0;

		System.out.println(bo);
		try {
			con = drds.getConnection();
			cst = con.prepareCall(FS_LAYERED_CUSTOMER_SINT);
			cst.setString(1, bo.getCustName());
			cst.setString(2, bo.getCustAddress());
			cst.setFloat(3, bo.getpAmt());
			cst.setFloat(4, bo.getRate());
			cst.setFloat(5, bo.getTime());
			cst.setFloat(6, bo.getIntrest());
			cst.registerOutParameter(7, Types.INTEGER);
			cst.execute();
			result = cst.getInt(7);
		} catch (Exception e) {
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
