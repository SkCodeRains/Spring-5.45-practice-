package com.rains.service;

import com.rains.bo.StudentBO;
import com.rains.dao.IStudentDAO;
import com.rains.dto.StudentDTO;

public class StudentMgmtServiceImpl implements IStudentMgmtService {
	private IStudentDAO dao;

	public StudentMgmtServiceImpl(IStudentDAO dao) {
		System.out.println("StudentMgmtServiceImpl. 1 param constructor ");
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total = dto.getM1() + dto.getM2() + dto.getM3();
		float avg = total / 3.0f;
		String result = null;
		if (dto.getM1() > 35 && dto.getM2() > 35 && dto.getM3() > 35)
			result = "First class with distinction";
		else if (dto.getM1() > 35 && dto.getM2() > 35 && dto.getM3() > 35)
			result = "First class";
		else if (dto.getM1() > 35 && dto.getM2() > 35 && dto.getM3() > 35)
			result = "second class";
		else if (dto.getM1() > 35 && dto.getM2() > 35 && dto.getM3() > 35)
			result = "third class";
		else
			result = "failed with distinction";

		StudentBO bo = new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setAvg(avg);
		bo.setResult(result);
		bo.setTotal(total);
		int count = dao.insertStudent(bo);

		return count == 0 ? "Student Registration failed... Result is : " + result
				: "Student Registration is successful result is : " + result;
	}

}
