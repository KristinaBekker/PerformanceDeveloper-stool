package com.kristina.performance.ui;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;

import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformancePackage;



class PerfomanceTreeFactoryImpl implements IObservableFactory {
		IEMFListProperty list = EMFProperties
				.list(UserPerformancePackage.Literals.PERFORMANCE__USERS);
		IEMFListProperty list1 = EMFProperties
				.list(FeaturePath
						.fromList(UserPerformancePackage.Literals.USER__TASKS));
		IEMFListProperty list2 = EMFProperties
				.list(FeaturePath
						.fromList(UserPerformancePackage.Literals.TASK__SUBTASKS));

		@Override
		public IObservable createObservable(Object target) {
			if (target instanceof IObservableList) {
				return (IObservable) target;
			} else if (target instanceof Performance) {

				return list.observe(target);

			} else if (target instanceof User) {
				
				return list1.observe(target);

			}
			else if (target instanceof Task){
				return list2.observe(target);
			}

			return null;

		}
	}