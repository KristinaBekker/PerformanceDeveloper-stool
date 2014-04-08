package com.kristina.performance.core;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	public List<Runnable> r = new ArrayList<Runnable>(); 
	private PerformanceModel() {
		performance = UserPerformanceFactory.eINSTANCE.createPerformance();

		performance.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				for(Runnable t : r){
					t.run();
				}	 
//		if(notification.getNotifier() instanceof Task ){
			
//			Task task =(Task)(notification.getNotifier());
//			if(UserPerformancePackage.Literals.TASK__NAME.equals(
//			notification.getFeature())){
//				refreshName();
//			};
			
//			UserPerformancePackage.Literals.USER__TASKS.eGet((EStructuralFeature) notification.getFeature());
//			System.err.println("");
//		}
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
	public void refreshName() {
		// TODO Auto-generated method stub
		
	}

}
