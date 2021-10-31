package com.rains.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rains.dao.IEmployeeDAO;
import com.rains.model.Employee;

@Service("empService")
public class EmployeeServiceimpl implements IEmployeService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public Employee fetchEmpDetailsByEmpNo(int eno) {
		System.out.println("EmployeeServiceimpl 1");
		return dao.getEmpDetailsById(eno);
	}

	@SuppressWarnings("unused")
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
	public List<Employee> fetchEmpDetailsByDesg(String... desg) {
		desg = empDesg(desg);
		return dao.getEmpDetailsByDesg(desg);
	}

	@Override
	public List<Employee> fetchEmpDetailsByDesgRS(String... desg) {
		desg = empDesg(desg);
		return dao.getEmpDetailsByDesg(desg);
	}
}
