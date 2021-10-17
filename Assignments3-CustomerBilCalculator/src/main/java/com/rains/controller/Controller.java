package com.rains.controller;

import com.rains.dto.CustomerDTO;
import com.rains.service.ICustomerService;
import com.rains.vo.CustomerVO;

public class Controller {
	ICustomerService service;

	public Controller(ICustomerService service) {
		super();
		this.service = service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		// creating object dto to set
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddress(vo.getCustAddress());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		return service.generateResult(dto);
	}
}
