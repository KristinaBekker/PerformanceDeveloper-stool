package com.kristina.performance.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import UserPerformance.Task;

public abstract class BaseSelectionListenerRemoveTaskAction extends
		BaseSelectionListenerAction {

	protected BaseSelectionListenerRemoveTaskAction(String text) {

		super(text);

	}

	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		for (Object y : selection.toArray()) {
			if (y instanceof Task) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
