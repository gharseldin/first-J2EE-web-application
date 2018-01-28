package com.gharseldin.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/capture")
public class capture extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		request.getRequestDispatcher("/WEB-INF/views/capture.jsp").forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String capture = request.getParameter("name");
		request.setAttribute("capture", capture);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
	
	
	
	
}
