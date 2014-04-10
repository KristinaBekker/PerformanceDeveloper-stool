package com.kristina.performance.core;

import java.util.EventListener;

import UserPerformance.Task;
import UserPerformance.User;

public interface IUserPerformanceModelLister extends EventListener {
	void taskModifyed(Task task);
	 void userModifyed(User user);
	void taskNameModifyed(Task task, String value);
	void taskStatusModifyed();
	void taskDescriptionModifyed(Task task, String value);
	void taskTimeActiveModifyed(Task task, double d);
	void userTimeActiveModifyed(double newDoubleValue);
	void modifyed();
	

	 
}
