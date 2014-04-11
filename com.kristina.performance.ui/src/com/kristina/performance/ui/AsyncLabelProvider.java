package com.kristina.performance.ui;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;

import UserPerformance.Interval;
import UserPerformance.Task;

public class AsyncLabelProvider extends ColumnLabelProvider {

	private final IObservableSet intervals;
	private Set<Task> taskFromIntervals;
	
	private final Map<EObject, Float> cache = Collections
			.synchronizedMap(new HashMap<EObject, Float>());

	private final ISetChangeListener listener = new ISetChangeListener() {

		@Override
		public void handleSetChange(SetChangeEvent event) {
			new CalcJob().schedule();
		}
	};

	public AsyncLabelProvider(IObservableSet intervals) {
		super();
		this.intervals = intervals;
		intervals.getElementType();

		this.taskFromIntervals = getTask(this.intervals);
		this.intervals.addSetChangeListener(listener);
	}

	

	

	class CalcJob extends Job {
		public CalcJob() {
			super("");
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			final Set<EObject> tasks = new HashSet<EObject>(cache.keySet());
			for (EObject task : tasks) {

//								Set tasksFromIntervals = null;
				if (!taskFromIntervals.contains(task))
					cache.put((EObject) tasks, calcProcedure(task));
			}
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					fireLabelProviderChanged(new LabelProviderChangedEvent(
							AsyncLabelProvider.this, tasks.toArray()));
				}
			});
			return null;
		}
	};

	public float calcProcedure(EObject task) {
		return 0F;
	}

	@Override
	public String getText(Object element) {
		Float rv = cache.put((EObject) element, 0F);
		if (rv == null)
			new CalcJob().schedule();
		return rv.toString();
	}

	@Override
	public void dispose() {
		intervals.removeSetChangeListener(listener);
		super.dispose();
	}
	private Set<Task> getTask(IObservableSet intervals) {
		HashSet<Interval> intervalsSet = new HashSet<Interval>(intervals);
		HashSet<Task> tasks = new HashSet<Task>();
		for (Interval i : intervalsSet) {
			Task intervalTask = i.getTask();
			tasks.add(intervalTask);
		}
		return tasks;
	}

}