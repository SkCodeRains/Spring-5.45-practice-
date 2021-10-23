package com.rains.dao;

import com.rains.bo.StudentBO;

public interface IStudentDAO {
	String INSERT_STUDENT_QUERY = "{call insert_into_student(?,?,?,?,?,?)}";

	int insertStudent(StudentBO stbo) throws Exception;

}
