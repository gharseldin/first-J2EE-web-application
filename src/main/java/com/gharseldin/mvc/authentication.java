package com.gharseldin.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gharseldin.services.authenticationService;

@WebServlet("/authenticate")
public class authentication extends HttpServlet{

	private authenticationService service = new authenticationService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/authenticationForm.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(service.isUserValid(username, password)) {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/authenticationForm.jsp").forward(request, response);
		}
	}
	
	

	
}
