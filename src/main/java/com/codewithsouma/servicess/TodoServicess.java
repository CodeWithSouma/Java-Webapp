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
		todoList.add(new Todo("Learn Spring Boot & Microservices"));
	}
	
	public List<Todo> getTodoList(){
		return todoList;
	}

	public void addItem(String item) {
		todoList.add(new Todo(item));
	}
}
