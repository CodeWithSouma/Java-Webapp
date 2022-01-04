package com.codewithsouma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if(isValid(email, password)) {
			boolean isLoggedIn=true;
			int token=4584;

			response.sendRedirect("/dashboard?isLoggedIn="+isLoggedIn+"&&Token="+token);
		}
		else
			response.sendRedirect("/");
		
	}
	
	private boolean isValid(String email, String password) {
		return email.equals("souma.hitech@gmail.com") && password.equals("12345");
	}
}
