package com.kristina.performance.core;

import java.util.Calendar;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import UserPerformance.Parameters;
import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;

public class PerformanceModel {

	private static volatile PerformanceModel instance = null;
	private Performance performance;

	private PerformanceModel() {
		performance = UserPerformanceFactory.eINSTANCE.createPerformance();

		performance.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				 
				if (notification.getNotifier() instanceof Task) {
					System.err.println("task");
				}
				
				if (notification.getNotifier() instanceof User)
					System.err.println("gf");
				notification.getNewValue();
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

}
