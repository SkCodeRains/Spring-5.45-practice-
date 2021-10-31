package com.rains.service;

import java.util.List;
import java.util.Map;

import com.rains.dao.IEmployeeDAO;

public class EmployeeServiceimpl implements IEmployeService {
	private IEmployeeDAO dao;

	public EmployeeServiceimpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int fetchEmpsCount() {
		return dao.getEmpsCount();

	}

	@Override
	public String fetchEmpName(int id) {
		return dao.getEmpNameByEmpNo(id);
	}

	@Override
	public Map<String, Object> fetchEmpDetailsByEmpNo(int eno) {
		// TODO Auto-generated method stub
		return dao.getEmpDetailsByEmpNo(eno);
	}

	private String[] empDesg(String... desg) {
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			try {
				s[i] = desg[i].toUpperCase();
				System.out.println(s[i]);
			} catch (Exception e) {

				s[i] = "";
			}
		}
		desg = s;
		return desg;
	}

	@Override
	public List<Map<String, Object>> fetchEmpDetailsByDesg(String... desg) {
		desg = empDesg(desg);
		return dao.getEmpDetailsByDesg(desg);
	}

	@Override
	public String firedEmpWhoNotHavinDesg() {
		int fired = dao.delEmpByNoDesg();
		if (fired == 0)
			return "No Employee Is Fired Because All Employees are having department";

		return fired + " fired because they dont have designation ";
	}

	@Override
	public String DepositSalaryWithBonus(String... desg) {
		desg = empDesg(desg);

		for (String string : desg) {
			System.out.println(string.toUpperCase());
		}

		int updates = dao.updateEmpSalByDesg(desg);
		return updates + " Number of employees got salary with bonus benifits!!!!";
	}

	@Override
	public String registerEmployee(String name, String desg, float salary) {
		int result = dao.registerEmployee(name, desg, salary);
		return result == 0 ? "No record inserted " : "employee : " + name + ", sucessfully registered";
	}

}
