package com.rains.service;

import com.rains.bo.CustomerBO;
import com.rains.dao.ICustomerDAO;
import com.rains.dto.CustomerDTO;

public class CustomerServiceImpl implements ICustomerService {

	ICustomerDAO dao;

	public CustomerServiceImpl(ICustomerDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String generateResult(CustomerDTO dto) throws Exception {
		// set bo object
		CustomerBO bo = new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddress(dto.getCustAddress());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrest(((dto.getpAmt() * dto.getRate() * dto.getTime()) / 100));
		return dao.insertCustomer(bo) == 1 ? "Customer Data Inserted Successfully \n" + bo : "internal Problem occured";

	}

}
