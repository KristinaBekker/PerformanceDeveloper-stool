package com.kristina.performance.ui;

import org.eclipse.nebula.widgets.datechooser.DateChooser;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;

public class PerformanceCalendar extends DateChooser {

	public PerformanceCalendar(Composite parent, int style) {

		super(parent, style);
		MouseListener m = new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				calculationByDate();

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

	private void calculationByDate() {
		System.err.println(df1.format(currentMonthCal.getTime()));

	}
	


}
