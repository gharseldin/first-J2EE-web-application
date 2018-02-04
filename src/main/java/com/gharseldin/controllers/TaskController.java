package com.gharseldin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gharseldin.services.TaskService;

@Controller
public class TaskController {

	@Autowired
	TaskService service;
	
	@RequestMapping(value ="/list-tasks", method = RequestMethod.GET)
	public String gotoLoginPage(ModelMap model) {
		model.addAttribute("tasks", service.retrieveTasks("gharseldin"));
		return "tasks";
	}
	
	@RequestMapping(value="/list-tasks", method = RequestMethod.POST)
	public String gotoTasksPage() {
		return "";
	}
}
