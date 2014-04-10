package com.kristina.performance.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import UserPerformance.Parameters;
import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;
import UserPerformance.UserPerformancePackage;

public class PerformanceModel {

	private static volatile PerformanceModel instance = null;
	private Performance performance;
	private List<IUserPerformanceModelLister> listeners = new ArrayList<IUserPerformanceModelLister>();

	private PerformanceModel() {
		performance = UserPerformanceFactory.eINSTANCE.createPerformance();
		
		performance.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {

				if (notification.getNotifier() instanceof Task) {

					Task task = (Task) (notification.getNotifier());
					if(UserPerformancePackage.Literals.TASK__NAME.equals(notification.getFeature())){
						for (IUserPerformanceModelLister listener : listeners) {

							listener.taskNameModifyed(task, notification.getNewStringValue());
						}
					}
					if(UserPerformancePackage.Literals.TASK__DESCRIPTION.equals(notification.getFeature())){
						for (IUserPerformanceModelLister listener : listeners) {

							listener.taskDescriptionModifyed(task, notification.getNewStringValue());
						}
					}
					if(UserPerformancePackage.Literals.TASK__STATUS.equals(notification.getFeature())){
						for (IUserPerformanceModelLister listener : listeners) {

							listener.taskStatusModifyed();
						}
					}
					for (IUserPerformanceModelLister listener : listeners) {
						listener.taskModifyed(task);
					}
				}else if(notification.getNotifier() instanceof User) {
					
					for (IUserPerformanceModelLister listener : listeners) {

						listener.modifyed();
					}
				}
				else if (notification.getNotifier() instanceof Parameters) {
					
					Parameters parameter = (Parameters) notification
							.getNotifier();
					EObject container = parameter.eContainer();
					
					if (container instanceof Task) {
						if(UserPerformancePackage.Literals.PARAMETERS__TIME_ACTIVE.equals(notification.getFeature())){
							for (IUserPerformanceModelLister listener : listeners) {

								listener.taskTimeActiveModifyed((Task)container, notification.getNewDoubleValue());
							}
						}
						for (IUserPerformanceModelLister listener : listeners) {

							listener.taskModifyed((Task) container);
						}
					} else if (container instanceof User){
						if(UserPerformancePackage.Literals.PARAMETERS__TIME_ACTIVE.equals(notification.getFeature())){
							for (IUserPerformanceModelLister listener : listeners) {

								listener.userTimeActiveModifyed( notification.getNewDoubleValue());
							}
						
					}
					}
					for (IUserPerformanceModelLister listener : listeners) {

						listener.userModifyed(performance.getUsers());
					}
				}
				super.notifyChanged(notification);
			}
		});
		User user = UserPerformanceFactory.eINSTANCE.createUser();
		Parameters parameters = UserPerformanceFactory.eINSTANCE
				.createParameters();
		user.setParameters(parameters);
		
		user.setDateStart(Calendar.getInstance().getTime());

		performance.setUsers(user);
	}

	public static PerformanceModel getInstance() {
		if (instance == null) {
			synchronized (PerformanceModel.class) {
				if (instance == null) {
					instance = new PerformanceModel();
				}
			}
		}
		return instance;
	}

	public Performance getPerformance() {
		return performance;
	}

	
	public List<IUserPerformanceModelLister> getlisteners(){
		return listeners;
	}

}
