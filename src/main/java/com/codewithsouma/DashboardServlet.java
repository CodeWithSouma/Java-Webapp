package com.codewithsouma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithsouma.servicess.TodoServicess;

@WebServlet(urlPatterns = "/dashboard")
public class DashboardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean isLoggedIn = Boolean.parseBoolean(request.getParameter("isLoggedIn"));
			int token = Integer.parseInt(request.getParameter("Token"));
			if(isLoggedIn && token==4584) {
				TodoServicess todoServicess = new TodoServicess();
				request.setAttribute("todoList", todoServicess.getTodoList());
				request.getRequestDispatcher("WEB-INF/views/Dashboard.jsp").forward(request, response);
			}
			else
				response.sendRedirect("/");
		}catch (Exception e) {
			response.sendRedirect("/");
		}
		
	}
}
