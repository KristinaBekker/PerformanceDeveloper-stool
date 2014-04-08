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

public class AddTaskDialog extends TitleAreaDialog{

	  private Text taskName;
	  private Text description;
	  private String title;
	  private String taskNameTekst;
	  private String descriptionText;
	  
	public AddTaskDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}




	  @Override
	  protected Control createDialogArea(Composite parent) {
	    Composite area = (Composite) super.createDialogArea(parent);
	    Composite container = new Composite(area, SWT.NONE);
	    container.setLayoutData(new GridData(GridData.FILL_BOTH));
	    GridLayout layout = new GridLayout(2, false);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(layout);

	    createTaskName(container);
	    createDescpiption(container);

	    return area;
	  }
	  @Override
	  public void create() {
	    super.create();
	    setTitle("Create a task");
	  
	  }

	  private void createTaskName(Composite container) {
	    Label lbtFirstName = new Label(container, SWT.NONE);
	    lbtFirstName.setText("Name");

	    GridData dataTaskName = new GridData();
	    dataTaskName.grabExcessHorizontalSpace = true;
	    dataTaskName.horizontalAlignment = GridData.FILL;

	    taskName = new Text(container, SWT.BORDER);
	    taskName.setLayoutData(dataTaskName);
	  }
	  
	  private void createDescpiption(Composite container) {
	    Label lbtDescription = new Label(container, SWT.NONE);
	    lbtDescription.setText("Description");
	    
	    GridData dataDescription = new GridData();
	    dataDescription.grabExcessHorizontalSpace = true;
	    dataDescription.horizontalAlignment = GridData.FILL;
	    description = new Text(container, SWT.BORDER);
	    description.setLayoutData(dataDescription);
	  }



	  @Override
	  protected boolean isResizable() {
	    return true;
	  }

	  // save content of the Text fields because they get disposed
	  // as soon as the Dialog closes
	  private void saveInput() {
	    taskNameTekst = taskName.getText();
	    descriptionText = description.getText();

	  }

	  @Override
	  protected void okPressed() {
	    saveInput();
	    super.okPressed();
	  }

	 
	  public void setShellTitle(String title){
		 this.title = title; 
	  }
	  @Override

		  protected void configureShell(Shell shell) {
				super.configureShell(shell);
				if (title != null) {
					shell.setText(title);
				}
			
	}
	  public String getName(){
		  return taskNameTekst;
	  }
	  public String getDescription(){
		  return descriptionText;
	  }
	} 
