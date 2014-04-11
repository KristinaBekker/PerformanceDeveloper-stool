package com.kristina.performance.ui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.nebula.widgets.datechooser.DateChooser;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;

import com.kristina.performance.core.IUserPerformanceModelLister;

public class PerformanceCalendar extends DateChooser {
	public Date start;
	public Date end;
	public List<ICalendarListener> calendarListeners = new ArrayList<>();
	public PerformanceCalendar(Composite parent, int style) {

		super(parent, style);
		MouseListener m = new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				
				for (ICalendarListener listener : calendarListeners) {
                      start = Calendar.getInstance().getTime();
                     end = Calendar.getInstance().getTime();
					listener.setValue(start,end);
				}

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		};

		prevMonth.addMouseListener(m);
		nextMonth.addMouseListener(m);
		currentMonth.addMouseListener(m);

	}


	


}
