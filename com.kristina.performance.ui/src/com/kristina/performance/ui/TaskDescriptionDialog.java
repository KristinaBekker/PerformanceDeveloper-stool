package com.kristina.performance.ui;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import UserPerformance.Parameters;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;

public class TaskDescriptionDialog extends TitleAreaDialog {

	private Text taskName;
	private Text description;
	private String title;
	private String taskNameTekst;
	private String descriptionText;
	private Object item;

	public TaskDescriptionDialog(Shell parentShell, Object item) {

		super(parentShell);
		this.item = item;

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		// container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(2, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		createTaskName(container);
		createDescpiption(container);
		createParameters(container);
		return area;
	}

	@Override
	public void create() {
		super.create();
		setTitle("Information about task");

	}

	private void createParameters(Composite container) {
		// Parameters g = UserPerformanceFactory.eINSTANCE.createParameters();
		//
		// g.getTimePassive();
		// g.getTimeActive();
		// g.getTypingSpeed();
		// g.getNumberOfCharacters();
		// g.getCountSavedEditing();
		// g.getNumberOfSwitches();
		// g.getErrorsCount();
		// g.getTimeToCorrectionErrors();
		// g.getTypoCount();

		Label lbtTimeActive = new Label(container, SWT.NONE);
		lbtTimeActive.setText("Active time");

		GridData dataTaskName = new GridData();
		dataTaskName.grabExcessHorizontalSpace = false;

		Text timeActive = new Text(container, SWT.BORDER);
		timeActive.setLayoutData(dataTaskName);
		Label lbtTimePassive = new Label(container, SWT.NONE);
		lbtTimePassive.setText("Active time");

		dataTaskName = new GridData();
		dataTaskName.grabExcessHorizontalSpace = false;
		dataTaskName.grabExcessVerticalSpace = true;

		Text timePassive = new Text(container, SWT.BORDER);
		timePassive.setLayoutData(dataTaskName);

	}

	private void createTaskName(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Name");

		GridData dataTaskName = new GridData();
		dataTaskName.grabExcessHorizontalSpace = true;
		dataTaskName.horizontalAlignment = GridData.FILL;

		taskName = new Text(container, SWT.BORDER);
		taskName.setLayoutData(dataTaskName);
		if (item instanceof Task) {
			taskName.setText(((Task) item).getName());
		} else if (item instanceof User) {
			taskName.setText("Common");
			taskName.setEnabled(false);
		}
	}

	private void createDescpiption(Composite container) {
		Label lbtDescription = new Label(container, SWT.NONE);
		lbtDescription.setText("Description");

		GridData dataDescription = new GridData();
		dataDescription.grabExcessHorizontalSpace = true;
		dataDescription.horizontalAlignment = GridData.FILL;
		description = new Text(container, SWT.BORDER);
		description.setLayoutData(dataDescription);
		if (item instanceof Task) {
			description.setText(((Task) item).getDescription());
		} else if (item instanceof User) {
			description.setText("Common time");
			description.setEnabled(false);
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private void saveInput() {
		taskNameTekst = taskName.getText();
		descriptionText = description.getText();
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getFirstName() {
		return taskNameTekst;
	}

	public String getLastName() {
		return descriptionText;
	}

	public void setShellTitle(String title) {
		this.title = title;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		if (title != null) {
			shell.setText(title);
		}

	}

	public String getName() {
		return taskNameTekst;
	}

	public String getDescription() {
		return descriptionText;
	}
}
