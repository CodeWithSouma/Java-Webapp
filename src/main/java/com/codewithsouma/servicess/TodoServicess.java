package com.codewithsouma.servicess;

import java.util.ArrayList;
import java.util.List;

public class TodoServicess {
	private static List<Todo> todoList= new ArrayList<>();
	static{
		todoList.add(new Todo("Learn Java Programming"));
		todoList.add(new Todo("Learn Servlet JSP"));
		todoList.add(new Todo("Learn Hibernate"));
		todoList.add(new Todo("Learn Spring MVC"));
		todoList.add(new Todo("Learn Spring Boot"));
	}
	
	public List<Todo> getTodoList(){
		return todoList;
	}

	public void addTodo(String item) {
		todoList.add(new Todo(item));
	}
	public void deleteTodo(Todo item) {
		todoList.remove(item);
		
	}
}
