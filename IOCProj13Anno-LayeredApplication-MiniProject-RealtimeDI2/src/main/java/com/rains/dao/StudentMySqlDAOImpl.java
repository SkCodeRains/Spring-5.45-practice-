package com.rains.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.rains.bo.StudentBO;

public class StudentMySqlDAOImpl implements IStudentDAO {
	private String INSERT_STUDENT_QUERY = "insert into FS_LAYERED_STUDENTS values (FS_STUDENTS_SNO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public StudentMySqlDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl. 1 PARAM Constructor");
		this.ds = ds;
	}

	@Override
	public int insertStudent(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement pst = null;
		int result = 0;
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(INSERT_STUDENT_QUERY);
			pst.setString(1, bo.getSname());
			pst.setString(2, bo.getSadd());
			pst.setLong(3, bo.getTotal());
			pst.setFloat(4, bo.getAvg());
			pst.setString(5, bo.getResult());
			result = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("StudentDAOImpl.insertStudent()");
			System.err.println(e);
			throw e;
		} finally {
			try {
				if (pst != null)
					pst.close();
			} catch (Exception e2) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}

}
