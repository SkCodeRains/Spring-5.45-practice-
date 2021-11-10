package com.rains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rains.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String registerEmployee(int eno) {
		return dao.GetEmpByNo(eno);
	}

	@Override
	public String GetEmpNameById(int eno) {
		return dao.GetEmpByNo(eno);
	}

}