package com.rains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rains.dto.StudentDTO;
import com.rains.service.IStudentMgmtService;
import com.rains.vo.StudenVO;

@Controller("controller")
public class MainController {
	// HAS-A property
	@Autowired
	private IStudentMgmtService service;

	public String processStudent(StudenVO vo) throws Exception {
		StudentDTO dto = new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		String result = service.generateResult(dto);
		return result;
	}

}
