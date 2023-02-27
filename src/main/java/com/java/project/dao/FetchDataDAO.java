package com.java.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.java.project.model.ClassName;
import com.java.project.model.Students;
import com.java.project.model.Subjects;
import com.java.project.model.Teachers;

public class FetchDataDAO {
	
	private DataSource dataSource;
	public FetchDataDAO(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	public FetchDataDAO()
	{
		super();
	}
	
	public List<Students> getStudentList(ClassName objClass) throws SQLException
	{
		List<Students> stdList = new ArrayList<Students>();
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase3_project","root","Abhi@1234");
			stmnt = conn.createStatement();
			String query = "select st.rollNo,st.name from  phase3_project.students_table as st where st.class_student_id = " + objClass.getClassCode();
			rs = stmnt.executeQuery(query);
			
			while(rs.next())
			{
				int rollNo = rs.getInt(1);
				String name = rs.getString(2);
				Students objStd = new Students(rollNo,name);
				stdList.add(objStd);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmnt!=null)
			{
				stmnt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
		
		
		return stdList;
	}
	
	public List<Teachers> getTeachersList(ClassName objClass) throws SQLException
	{
		List<Teachers> teachersList = new ArrayList<Teachers>();
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase3_project","root","Abhi@1234");
			stmnt = conn.createStatement();
			String query = "select tt.id,tt.teachersName from phase3_project.teachers_table_classes_names as tc, phase3_project.teachers_table as tt "
					+ "where tt.id = tc.Teachers_id and tc.classList_classCode = " + objClass.getClassCode();
			rs = stmnt.executeQuery(query);
			
			while(rs.next())
			{
				int teacherId = rs.getInt(1);
				String tname = rs.getString(2);
				Teachers obj = new Teachers(teacherId,tname);
				teachersList.add(obj);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmnt!=null)
			{
				stmnt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
		
		return teachersList;
	}
	
	public List<Subjects> getSubjectsList(ClassName objClass) throws SQLException
	{
		List<Subjects> subjectsList = new ArrayList<Subjects>();
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase3_project","root","Abhi@1234");
			stmnt = conn.createStatement();
			String query = "SELECT st.subjectCode, st.subName FROM phase3_project.subjects_table_classes_names as sc,phase3_project.subjects_table as st "
					+ "where st.subjectCode = sc.Subjects_subjectCode and sc.classList_classCode = " + objClass.getClassCode();
			rs = stmnt.executeQuery(query);
			
			while(rs.next())
			{
				int subjectCode = rs.getInt(1);
				String subName = rs.getString(2);
				Subjects obj = new Subjects(subjectCode,subName);
				subjectsList.add(obj);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmnt!=null)
			{
				stmnt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
		
		return subjectsList;
	}
	
	public List<ClassName> getClassList() throws SQLException
	{
		List<ClassName> classList = new ArrayList<ClassName>();
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase3_project","root","Abhi@1234");
			stmnt = conn.createStatement();
			String query = "SELECT * FROM phase3_project.classes_names";
			rs = stmnt.executeQuery(query);
			
			while(rs.next())
			{
				int classCode = rs.getInt(1);
				String className = rs.getString(2);
				ClassName obj = new ClassName(classCode,className);
				classList.add(obj);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmnt!=null)
			{
				stmnt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
		
		return classList;
	}

}
