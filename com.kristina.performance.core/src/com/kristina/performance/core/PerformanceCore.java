package com.kristina.performance.core;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import UserPerformance.Interval;
import UserPerformance.Parameters;
import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;

public class PerformanceCore {
	private static final Object START = "start";
	private User user;
	private Date currentTimeInterval;
	private Date startTimeInterval;
	private Interval interval;
	private String name;

	public PerformanceCore(final Performance performance) {
		startTimeInterval = Calendar.getInstance().getTime();
		currentTimeInterval = Calendar.getInstance().getTime();
		interval = UserPerformanceFactory.eINSTANCE.createInterval();
		Parameters parameter = UserPerformanceFactory.eINSTANCE.createParameters();
		interval.setParameter(parameter);
		
		user = performance.getUsers();

		PlatformUI.getWorkbench().addWindowListener(new IWindowListener() {

			@Override
			public void windowDeactivated(IWorkbenchWindow window) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosed(IWorkbenchWindow window) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(IWorkbenchWindow window) {
				checkedActivity();

			}

			@Override
			public void windowOpened(IWorkbenchWindow window) {
				// TODO Auto-generated method stub

			}
		});
		PlatformUI.getWorkbench().addWorkbenchListener(
				new IWorkbenchListener() {

					@Override
					public boolean preShutdown(IWorkbench workbench,
							boolean forced) {

						return true;
					}

					@Override
					public void postShutdown(IWorkbench workbench) {
						checkedActivity();
						// SAVE
					}
				});
		final Display eclipseDisplay = PlatformUI.getWorkbench().getDisplay();

		if (eclipseDisplay != null) {

			eclipseDisplay.syncExec(new Runnable() {

				@Override
				public void run() {

					eclipseDisplay.addFilter(SWT.MouseMove, new Listener() {

						@Override
						public void handleEvent(Event event) {
							checkedActivity();
						}
					});
					eclipseDisplay.addFilter(SWT.KeyDown, new Listener() {

						@Override
						public void handleEvent(Event event) {
							checkedActivity();
						}

					});

				}
			});

		}
	}

	private void checkedActivity() {
		Date now = Calendar.getInstance().getTime();
		long during = (now.getTime() - currentTimeInterval.getTime()) / 60000;
		long during2 = (now.getTime() - startTimeInterval.getTime()) / 60000;
		if (during < 5 || during2 < 5) {

			addInterval(user);
			startTimeInterval = now;
			interval = UserPerformanceFactory.eINSTANCE.createInterval();
			Parameters parameter = UserPerformanceFactory.eINSTANCE.createParameters();
			interval.setParameter(parameter);
		}
		currentTimeInterval = now;
	}

	private void addInterval(User user) {
		
//		name = "common";
//		long during = (currentTimeInterval.getTime() - startTimeInterval
//				.getTime()) / 60000;
//		if (!user.getTasks().isEmpty()) {
//			for (Task task : user.getTasks()) {
//				if (task.getStatus().equals(START)) {
//					task.getParameters().setTimeActive(
//							task.getParameters().getTimeActive() + during);
//					name = task.getName();
//					
//				}
//				for (Task subtask : task.getSubtasks()) {
//
//					if (subtask.getStatus().equals(START)) {
//						subtask.getParameters().setTimeActive(
//								subtask.getParameters().getTimeActive()
//										+ during +400);
//						subtask.getParameters().setTimeActive(
//						subtask.getParameters().getTimeActive() + during);
//						name = subtask.getName();
//						
//					}
//				}
//			}
//		}
//			user.getParameters().setTimeActive(
//					user.getParameters().getTimeActive() + during +400);
//			interval.getParameter().setTimeActive(during);
//			interval.setNameTask(name);
//			interval.setEnd(currentTimeInterval);
//			interval.setStart(startTimeInterval);
//			user.getIntervals().add(interval);
		
	}

}
