package com.rains.controller;

import com.rains.dto.StudentDTO;
import com.rains.service.IStudentMgmtService;
import com.rains.vo.StudenVO;

public class MainController {
	// HAS-A property
	private IStudentMgmtService service;

	public MainController(IStudentMgmtService service) {
		super();
		this.service = service;
	}

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
