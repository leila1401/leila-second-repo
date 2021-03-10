package com.saraya;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.model.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	TodoService todoservice;
	

	@RequestMapping(value="/todoList" , method = RequestMethod.GET)
	public String showTodoListPage(ModelMap model) {
		String user = (String) model.get("name");
		model.addAttribute("todos" , todoservice.retrieveTodo(user));
		return "todoList";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deletetodo(@RequestParam int id) {
		todoservice.deleteTodo(id);
		return "redirect:/todoList";
	}
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String addPage() {
				return "add-todo";
	}
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addPage(ModelMap model, @RequestParam String description) {
		todoservice.addTodo((String) model.get("name"), description, new Date(), false);
				return "redirect:/todoList";
	}
	
	
	
	}
	


