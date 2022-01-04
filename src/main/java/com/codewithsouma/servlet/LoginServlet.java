package com.codewithsouma.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithsouma.servicess.LoginServicess;

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

		if(LoginServicess.isValid(email, password)) {
			boolean isLoggedIn=LoginServicess.getLoggedInStatus();
			int token=LoginServicess.getToken();
			
			String name = "Souma"; //getting name from user
			request.getSession().setAttribute("name", name);
			request.getSession().setAttribute("isLoggedIn", isLoggedIn);
			request.getSession().setAttribute("Token", token);
			response.sendRedirect("/dashboard");
			
		}
		else
			response.sendRedirect("/");
		
	}
	
}
