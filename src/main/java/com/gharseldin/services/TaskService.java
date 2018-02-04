package com.gharseldin.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gharseldin.models.Task;

@Service
public class TaskService {
	private static List<Task> tasks = new ArrayList<Task>();
	private static int TaskCount = 3;

	static {
		tasks.add(new Task(1, "gharseldin", "Learn Spring MVC", new Date(),
				false));
		tasks.add(new Task(2, "gharseldin", "Learn Struts", new Date(), false));
		tasks.add(new Task(3, "gharseldin", "Learn Hibernate", new Date(),
				false));
	}

	public List<Task> retrieveTasks(String user) {
		List<Task> filteredTasks = new ArrayList<Task>();
		for (Task Task : tasks) {
			if (Task.getUser().equals(user))
				filteredTasks.add(Task);
		}
		return filteredTasks;
	}

	public void addTask(String name, String desc, Date targetDate, boolean isDone) {
		tasks.add(new Task(++TaskCount, name, desc, targetDate, isDone));
	}

	public void deleteTask(int id) {
		Iterator<Task> iterator = tasks.iterator();
		while (iterator.hasNext()) {
			Task Task = iterator.next();
			if (Task.getId() == id) {
				iterator.remove();
			}
		}
	}
}