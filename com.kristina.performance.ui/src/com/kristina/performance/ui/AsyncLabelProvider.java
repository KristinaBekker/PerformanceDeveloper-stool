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
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;

public class AsyncLabelProvider extends ColumnLabelProvider {

    class Task {}
    
    private final IObservableSet intervals;
    Set<Task> taskFromIntervals;
    
    private final ISetChangeListener listener = new ISetChangeListener() {
        
        @Override
        public void handleSetChange(SetChangeEvent event) {
            new CalcJob().schedule();
        }
    };
    
    public AsyncLabelProvider(IObservableSet intervals, Set<Task> taskFromIntervals) {
        super();
        this.intervals = intervals;
        intervals.getElementType();
   
        this.taskFromIntervals = taskFromIntervals;
        this.intervals.addSetChangeListener(listener);
    }
    private Set<Task> getTask(IObservableSet intervals){
    	for( Object i : intervals){
    		
    	}
    return null;	
    }

    private final Map<Task, Float> cache = Collections.synchronizedMap(new HashMap<Task, Float>()); 
    
    class CalcJob extends Job {
        public CalcJob() {
            super("");
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            final Set<Task> tasks = new HashSet<Task>(cache.keySet());
            for (Task task: tasks) {
              Set tasksFromIntervals = null;
				if (!tasksFromIntervals.contains(task))
                    cache.put(task, calcProcedure(task));
            }
            Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    fireLabelProviderChanged(new LabelProviderChangedEvent(AsyncLabelProvider.this, tasks.toArray()));
                }
            });
            return null;
        }
    }; 
    
    
    public float calcProcedure(Task task){
    	return 0F;
    }
    
    @Override
    public String getText(Object element) {
        Float rv = cache.put((Task)element, 0F);
        if (rv == null)
            new CalcJob().schedule();
        return rv.toString();
    }

    @Override
    public void dispose() {
        intervals.removeSetChangeListener(listener);
        super.dispose();
    }
    
}