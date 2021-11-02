package com.rains.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rains.dao.IEmployeeDAO;
import com.rains.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	IEmployeeDAO dao;

	@Override
	public String fetchEmpByEmpNo(int eno) {
		return dao.getEmpNameByNo(eno);
	}

	@Override
	public List<Employee> fetchEmpDetailsByDesg(String... desg) {
		desg = empDesg(desg);
		return dao.getEmpDetailsByDesg(desg);
	}

	private String[] empDesg(String... desg) {
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			try {
				s[i] = desg[i].toUpperCase();
			} catch (Exception e) {
				s[i] = "";
			}
		}
		desg = s;
		return desg;
	}

	@Override
	public String addEmployee(Employee emp) {
		int res = dao.insertEmployee(emp);
		return res == 1 ? "emplyee " + emp.getEname() + " added " : "Adding Failed";
	}
}
