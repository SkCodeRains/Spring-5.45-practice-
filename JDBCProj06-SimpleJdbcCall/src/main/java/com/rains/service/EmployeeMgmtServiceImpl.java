package com.rains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rains.dao.IEmployeeDAO;
import com.rains.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String registerEmployee(Employee emp) {

		int count = dao.insert(emp);
		System.out.println(emp.getEmpno() + " and res is " + count);
		return count == 1 ? "Employee " + emp.getEname() + " Is Register with ID" + emp.getEmpno()
				: "Registration Failed";
	}

}