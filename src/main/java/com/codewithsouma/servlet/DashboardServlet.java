package com.codewithsouma.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithsouma.servicess.LoginServicess;
import com.codewithsouma.servicess.TodoServicess;

@WebServlet(urlPatterns = "/dashboard")
public class DashboardServlet extends HttpServlet {
	TodoServicess todoServicess = new TodoServicess();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Boolean isLoggedIn =  (Boolean) request.getSession().getAttribute("isLoggedIn");
			int token = (int) request.getSession().getAttribute("Token");
			
			
			if(LoginServicess.validateToken(isLoggedIn, token)) {
				request.setAttribute("todoList", todoServicess.getTodoList());
				request.getRequestDispatcher("WEB-INF/views/Dashboard.jsp").forward(request, response);
			}
			else {
				response.sendRedirect("/");
				request.getSession().removeAttribute("isLoggedIn");
				request.getSession().removeAttribute("Token");
			}
		}catch (Exception e) {
			response.sendRedirect("/");
			request.getSession().removeAttribute("isLoggedIn");
			request.getSession().removeAttribute("Token");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Boolean isLoggedIn =  (Boolean) request.getSession().getAttribute("isLoggedIn");
			int token = (int) request.getSession().getAttribute("Token");
			String item = (String) request.getParameter("newToDo");
			
			if(LoginServicess.validateToken(isLoggedIn, token)) {
				if(!item.trim().isEmpty()) {
				todoServicess.addItem(item);
				}
				response.sendRedirect("/dashboard");
			}
		}catch (Exception e) {
			response.sendRedirect("/");
		}
	}
}
