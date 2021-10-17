package com.rains.dao;

import com.rains.bo.CustomerBO;

public interface ICustomerDAO {
	String FS_LAYERED_CUSTOMER_SINT = ("call {insert_fs_layered_customer_sint_(?,?,?,?,?,?,?)}");

	int insertCustomer(CustomerBO bo) throws Exception;
}
