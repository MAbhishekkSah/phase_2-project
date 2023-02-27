package com.java.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPage
 */
public class LearnersAcademyLoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearnersAcademyLoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String adminName = request.getParameter("userName");
		String pass = request.getParameter("password");
		if("admin".equals(pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("admin_userName",adminName);
			session.setAttribute("admin_password",pass);
			RequestDispatcher rd1 = request.getRequestDispatcher("/mainMenu.jsp");
			rd1.include(request, response);
		}
		else
		{
			pw.print("<br><p style=\"text-align: center;\">Invalid Credentials! Please Enter correct Username or Password.<br></p>");
			RequestDispatcher rd2 = request.getRequestDispatcher("/login.jsp");
			rd2.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
