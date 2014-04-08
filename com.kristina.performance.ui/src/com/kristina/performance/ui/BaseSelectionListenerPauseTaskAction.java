package com.kristina.performance.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import UserPerformance.Task;

public class BaseSelectionListenerPauseTaskAction extends BaseSelectionListenerAction{

	private static final Object PAUSE = "pause";
	protected BaseSelectionListenerPauseTaskAction(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		for (Object y : selection.toArray()) {
			if (y instanceof Task ) {
				if(((Task)y).getStatus().equals(PAUSE))
					return false;
				else
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
