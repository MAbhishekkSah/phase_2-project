package com.java.project.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.hibernate.Session;

import com.java.project.dao.FetchDataDAO;
import com.java.project.model.ClassName;
import com.java.project.model.Students;
import com.java.project.model.Subjects;
import com.java.project.model.Teachers;

/**
 * Servlet implementation class LearnersAcademyControllerServlet
 */
public class LearnersAcademyControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FetchDataDAO objFetchData = new FetchDataDAO();
/*	@Resource(name = "phase3_project")
	private DataSource dataSource;
	@Override
	public void init() throws ServletException
	{
		super.init();
		try
		{
			objFetchData = new FetchDataDAO(dataSource);
		}
		catch(Exception e)
		{
			System.out.print(e.toString());
		}
	}  */
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearnersAcademyControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
		ClassName objClass = new ClassName();
		HttpSession session = request.getSession(false);
		String className = (String)session.getAttribute("batch_name");
		System.out.println(className);
		String command = request.getParameter("command");
		if(className.equalsIgnoreCase("A1"))
		{
			objClass.setClass_name("A1");
			objClass.setClassCode(1);
			listCaller(request,response,objClass,command);
			
		}
		else if(className.equalsIgnoreCase("A2"))
		{
			objClass.setClass_name("A2");
			objClass.setClassCode(2);
			listCaller(request,response,objClass,command);
		}
		else if(className.equalsIgnoreCase("A3"))
		{
			objClass.setClass_name("A3");
			objClass.setClassCode(3);
			listCaller(request,response,objClass,command);
		}
		else if(className.equalsIgnoreCase("A4"))
		{
			objClass.setClass_name("A4");
			objClass.setClassCode(4);
			listCaller(request,response,objClass,command);
		}
		else if(className.equalsIgnoreCase("A5"))
		{
			objClass.setClass_name("A5");
			objClass.setClassCode(5);
			listCaller(request,response,objClass,command);
		}
		
	}
	
	private void listCaller(HttpServletRequest request, HttpServletResponse response, ClassName objClass,
			String command) {
		// TODO Auto-generated method stub
		
		if("student".equals(command))
		{
			try {
				studentsList(request,response,objClass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("teachers".equals(command))
		{
			try {
				teachersList(request,response,objClass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("subjects".equals(command))
		{
			try {
				subjectList(request,response,objClass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private void studentsList(HttpServletRequest request, HttpServletResponse response,ClassName objClass) throws Exception {
		// get students from db util
		List<Students> students = objFetchData.getStudentList(objClass);
		
		for(Students std : students)
		{
			System.out.print(std.getRollNo() + " " +std.getName());
		}
		// add students to the request
		request.setAttribute("STUDENT_LIST", students);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/students-list.jsp");
		dispatcher.forward(request, response);

	}

	private void teachersList(HttpServletRequest request, HttpServletResponse response,ClassName objClass) throws Exception {
		// get students from db util
		List<Teachers> teachers = objFetchData.getTeachersList(objClass);
		System.out.print(teachers);

		// add students to the request
		request.setAttribute("TEACHERS_LIST", teachers);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teachers-list.jsp");
		dispatcher.forward(request, response);

	}

	private void subjectList(HttpServletRequest request, HttpServletResponse response,ClassName objClass) throws Exception {
		// get subjects from db util
		List<Subjects> subjects = objFetchData.getSubjectsList(objClass);

		// add subjects to the request
		request.setAttribute("SUBJECTS_LIST", subjects);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/subjects-list.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
