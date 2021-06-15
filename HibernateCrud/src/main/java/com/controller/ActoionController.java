package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.StudentDAO;
import com.bean.Student;

public class ActoionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			Student s=new Student();
			s.setSfname(request.getParameter("sfname"));
			s.setSpass(request.getParameter("spass"));
			s.setScontact(Long.parseLong(request.getParameter("scontact")));
			s.setSemail(request.getParameter("semail"));
			StudentDAO.insert(s);
			response.sendRedirect("show.jsp");
			
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDAO.deleteStudent(id);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Student s=StudentDAO.getSinglRecord(id);
			request.setAttribute("stu", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Student s=new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setSfname(request.getParameter("sfname"));
			s.setSpass(request.getParameter("spass"));
			s.setScontact(Long.parseLong(request.getParameter("scontact")));
			s.setSemail(request.getParameter("semail"));
			StudentDAO.update(s);
			response.sendRedirect("show.jsp");
		}
	}

}
