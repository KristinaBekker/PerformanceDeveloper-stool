package com.kristina.performance.core;

import java.util.EventListener;

import UserPerformance.Task;
import UserPerformance.User;

public interface IUserPerformanceModelLister extends EventListener {
	void taskModifyed(Task task);
	 void userModifyed(User user);

	 
}