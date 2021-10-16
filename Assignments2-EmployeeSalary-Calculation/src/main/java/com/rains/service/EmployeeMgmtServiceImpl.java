package com.rains.service;

import com.rains.bo.EmployeeBO;
import com.rains.dao.IEmployeeDAO;
import com.rains.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private IEmployeeDAO dao;

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateResult(EmployeeDTO dto) throws Exception {
		float eSal = dto.geteSal();
		float grossSal = eSal + (eSal * 40 / 100);
		float netsal = grossSal - (grossSal * 10 / 100);

		EmployeeBO bo = new EmployeeBO();
		bo.seteName(dto.geteName());
		bo.seteAddress(dto.geteAddress());
		bo.seteSal(eSal);
		bo.setGrossSal(grossSal);
		bo.setNetSal(netsal);
		int count = dao.insertEmployee(bo);
		return count == 1 ? "employee data Inserted" : "internal Problem occured";
	}

}
