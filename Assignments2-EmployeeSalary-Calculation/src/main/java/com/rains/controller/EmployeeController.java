package com.rains.controller;

import com.rains.dto.EmployeeDTO;
import com.rains.service.EmployeeMgmtServiceImpl;
import com.rains.service.IEmployeeMgmtService;
import com.rains.vo.EmployeeVO;

public class EmployeeController {
	IEmployeeMgmtService service;

	public EmployeeController(EmployeeMgmtServiceImpl service) {
		super();
		this.service = service;
	}

	public String processEmployee(EmployeeVO vo) throws Exception {
		EmployeeDTO dto = new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.seteAddress(vo.geteAddress());
		dto.seteSal(Float.parseFloat(vo.geteSal()));
		return service.generateResult(dto);
	}

}
