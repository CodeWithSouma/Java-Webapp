package com.codewithsouma.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithsouma.servicess.LoginServicess;
import com.codewithsouma.servicess.Todo;
import com.codewithsouma.servicess.TodoServicess;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Boolean isLoggedIn =  (Boolean) request.getSession().getAttribute("isLoggedIn");
			int token = (int) request.getSession().getAttribute("Token");
			
			
			if(LoginServicess.validateToken(isLoggedIn, token)) {
				TodoServicess todoServicess = new TodoServicess();
				todoServicess.deleteTodo(new Todo(request.getParameter("todo")));
				response.sendRedirect("/dashboard");
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

}
