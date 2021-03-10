package com.saraya.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int countId = 0;
	static {
		todos.add(new Todo(1, "leila", "learn Html" , new Date() , true));
		todos.add(new Todo(2, "leila", "learn css" , new Date() , true));
		todos.add(new Todo(3, "leila", "learn to swim" , new Date() , true));
		todos.add(new Todo(4, "leila", "learn to fight" , new Date() , false));
		todos.add(new Todo(5, "leila", "learn basketball" , new Date() , true));
	}
	
	public List<Todo> retrieveTodo(String user){
		List<Todo> userTodo = new ArrayList<>();
		for(Todo todo : todos) {
			if(todo.getUser().equals(user))
				userTodo.add(todo);
		}
		return userTodo;
	}
	public void addTodo(String name , String description , Date targetDate , boolean isDone) {
		todos.add(new Todo(++countId , name , description , targetDate , isDone));
	}
	public void deleteTodo(int id) {
		Iterator<Todo> mady = todos.iterator();
		while(mady.hasNext()) {
			Todo todo = mady.next();
			if(todo.getId() == id) {
				mady.remove();
			}
		}
	}

}
