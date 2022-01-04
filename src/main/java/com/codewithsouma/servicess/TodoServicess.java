package com.codewithsouma.servicess;

import java.util.ArrayList;
import java.util.List;

public class TodoServicess {
	private List<Todo> todoList= new ArrayList<>();
	{
		todoList.add(new Todo("Learn Java Programming"));
		todoList.add(new Todo("Learn Servlet JSP"));
		todoList.add(new Todo("Learn Hibernate"));
		todoList.add(new Todo("Learn Spring MVC"));
	}
	
	public List<Todo> getTodoList(){
		return todoList;
	}
}
