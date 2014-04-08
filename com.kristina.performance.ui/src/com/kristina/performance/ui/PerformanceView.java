package com.kristina.performance.ui;

import java.util.Calendar;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import UserPerformance.Parameters;
import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;

import com.kristina.performance.core.PerformanceModel;

public class PerformanceView extends ViewPart {
	protected static final String COMMON = "Common";
	private static final String PAUSE = "pause";
	private static final String START = "start";
	private static final String STOP = "stop";
	
	private Performance performance = PerformanceModel.getInstance()
			.getPerformance();
	
	private Action removePerformanceAction;
	private Action startPerformanceAction;
	private Action pausevePerformanceAction;
	private Action stopPerformanceAction;
	
	private TreeViewer performanceTreeViewer;
	
	private User user = performance.getUsers();

	private Button removeButton;
	private Button upButton;
	private Button downButton;
	private Button moreButton;

	private DataBindingContext dbc = new DataBindingContext();

	private ColumnLabelProvider nameLabelProvider;
	private ColumnLabelProvider statusLabelProvider;
	private ColumnLabelProvider duringLabelProvider;

	public PerformanceView() {

		super();
	}

	public void setFocus() {

	}

	public void createPartControl(Composite parent) {

		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);
		TabFolder composite = new TabFolder(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		TabItem mainTab = new TabItem (composite, SWT.NULL);
		 mainTab.setText ("Main" );
		 TabItem byDateTab = new TabItem(composite, SWT.NULL);
		 byDateTab.setText("By date");
		 Composite mainTabControl  = new Composite(composite, SWT.NONE);
		 GridLayoutFactory.fillDefaults().numColumns(2).applyTo(mainTabControl);
			GridDataFactory.fillDefaults().grab(true, true).applyTo(mainTabControl);
		mainTab.setControl(mainTabControl  );
		
		
		createViewer(mainTabControl);
		createButtons(mainTabControl);
		createActions();
		createModelListener();
	
		createDataBinding(dbc);

	}

	private void createModelListener() {
	
//	 ((Performance)user.eContainer()).eAdapters().h
			
		
		 
	 }



	private void createDataBinding(DataBindingContext dbc2) {
		final IObservableValue launchViewerSelection = ViewersObservables
				.observeSingleSelection(performanceTreeViewer);
		IObservableValue removeSelected = new ComputedValue(Boolean.TYPE) {

			protected Object calculate() {
				Object selection = launchViewerSelection.getValue();
				if (selection instanceof Task) {
					return Boolean
							.valueOf(launchViewerSelection.getValue() != null);
				} else
					return false;
			}
		};
		IObservableValue upSelected = new ComputedValue(Boolean.TYPE) {
			protected Object calculate() {

				Object selection = launchViewerSelection.getValue();

				EList<Task> tasks = user.getTasks();
				if (selection instanceof Task) {
					if ((((Task) selection).eContainer() instanceof User)
							&& tasks.size() == 1) {
						return false;

					} else if ((((Task) selection).eContainer() instanceof User)
							&& tasks.get(0).equals(selection)) {
						return false;

					}

					else if ((((Task) selection).eContainer() instanceof Task)) {

						Task task = (Task) ((Task) selection).eContainer();

						if (task.getSubtasks().size() == 1) {
							return false;
						} else if (selection.equals(task.getSubtasks().get(0))) {
							return false;

						} else {
							return Boolean.valueOf(selection != null);

						}

					} else {
						return Boolean.valueOf(selection != null);
					}
				} else {
					return false;
				}
			}
		};
		IObservableValue moreSelected = new ComputedValue(Boolean.TYPE) {

			protected Object calculate() {
				Object selection = launchViewerSelection.getValue();
				return Boolean.valueOf(selection != null);
			}

		};

		IObservableValue downSelected = new ComputedValue(Boolean.TYPE) {
			protected Object calculate() {

				Object selection = launchViewerSelection.getValue();

				EList<Task> tasks = user.getTasks();
				if (selection instanceof Task) {
					if ((((Task) selection).eContainer() instanceof User)
							&& tasks.size() == 1) {
						return false;

					} else if ((((Task) selection).eContainer() instanceof User)
							&& tasks.get(tasks.size() - 1).equals(selection)) {
						return false;

					}

					else if ((((Task) selection).eContainer() instanceof Task)) {

						Task task = (Task) ((Task) selection).eContainer();

						if (task.getSubtasks().size() == 1) {
							return false;
						} else if (selection.equals(task.getSubtasks().get(
								tasks.size() - 1))) {
							return false;

						} else {
							return Boolean.valueOf(selection != null);

						}

					} else {
						return Boolean.valueOf(selection != null);
					}
				} else {
					return false;
				}
			}
		};
		dbc.bindValue(SWTObservables.observeEnabled(removeButton),
				removeSelected);
		dbc.bindValue(SWTObservables.observeEnabled(upButton), upSelected);
		dbc.bindValue(SWTObservables.observeEnabled(downButton), downSelected);
		dbc.bindValue(SWTObservables.observeEnabled(moreButton), moreSelected);
	}



	private void createActions() {

		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager toolBarManager = bars.getToolBarManager();

		final Action fAddPerformanceAction = createAddPerformanceAction();

		removePerformanceAction = createRemovePerformanceAction();
		startPerformanceAction = createStartPerformanceAction();
		pausevePerformanceAction = createPausePerformanceAction();
		stopPerformanceAction = createStopPerformanceAction();

		toolBarManager.add(fAddPerformanceAction);

		toolBarManager.add(removePerformanceAction);
		toolBarManager.add(startPerformanceAction);
		toolBarManager.add(pausevePerformanceAction);
		toolBarManager.add(stopPerformanceAction);
		MenuManager popupMenuManager = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		IMenuListener listener = new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {

				manager.add(new Separator());
				manager.add(fAddPerformanceAction);
				manager.add(new Separator());

				// ((EventDetailsDialogAction)
				// fPropertiesAction).setComparator(fComparator);
				TreeItem[] selection = performanceTreeViewer.getTree()
						.getSelection();
				if ((selection.length > 0) && (selection[0].getData() != null)) {
					manager.add(removePerformanceAction);
				}

				manager.add(new Separator(
						IWorkbenchActionConstants.MB_ADDITIONS));
			}
		};
		popupMenuManager.addMenuListener(listener);
		popupMenuManager.setRemoveAllWhenShown(true);
		getSite().registerContextMenu(popupMenuManager,
				getSite().getSelectionProvider());
		Menu menu = popupMenuManager.createContextMenu(performanceTreeViewer
				.getTree());
		performanceTreeViewer.getTree().setMenu(menu);

	}

	private Action createRemovePerformanceAction() {
		BaseSelectionListenerRemoveTaskAction action = new BaseSelectionListenerRemoveTaskAction(
				"remove") {
			{
				setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
						.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
			}

			public void run() {
				for (Object item : ((IStructuredSelection) performanceTreeViewer
						.getSelection()).toArray()) {
					if (item instanceof Task) {

						Task removeTask = (Task) item;
						EObject container = removeTask.eContainer();
						if (container instanceof User) {
							User userContainer = (User) container;
							userContainer.getTasks().remove(removeTask);
						} else if (container instanceof Task) {
							Task taskContainer = (Task) container;
							taskContainer.getSubtasks().remove(removeTask);
						}
					}
				}
				performanceTreeViewer.expandAll();
			}
		};
		action.setToolTipText("remove");
		action.setEnabled(false);
		performanceTreeViewer.addSelectionChangedListener(action);

		return action;
	}

	private Action createAddPerformanceAction() {
		Action action = new Action("add") {
			{
				setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
						.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
			}

			public void run() {

				AddTaskDialog newTaskDialog = new AddTaskDialog(Display
						.getDefault().getActiveShell());
				newTaskDialog.setShellTitle("New Task");

				if (newTaskDialog.open() == IDialogConstants.OK_ID) {

					createTask(newTaskDialog.getName(),
							newTaskDialog.getDescription());
				}
			}

		};
		action.setToolTipText("add");
		action.setEnabled(true);

		return action;
	}

	private Action createStartPerformanceAction() {
		BaseSelectionListenerStartTaskAction action = new BaseSelectionListenerStartTaskAction(
				"start") {
			// {
			// setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
			// .getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
			// }

			public void run() {

				for (Task task : user.getTasks()) {
					if (task.getStatus().equals(START)) {
						task.setStatus(PAUSE);
						break;
					}
					for (Task subtask : task.getSubtasks()) {

						if (subtask.getStatus().equals(START)) {
							subtask.setStatus(PAUSE);
							break;
						}
					}
				}
				if (((IStructuredSelection) performanceTreeViewer
						.getSelection()).toArray().length != 0) {
					for (Object item : ((IStructuredSelection) performanceTreeViewer
							.getSelection()).toArray()) {
						if (item instanceof Task) {

							((Task) item).setStatus(START);
						}

					}
				}
			}

		};
		action.setToolTipText("start");

		action.setEnabled(false);
		performanceTreeViewer.addSelectionChangedListener(action);

		return action;
	}

	private Action createPausePerformanceAction() {
		BaseSelectionListenerPauseTaskAction action = new BaseSelectionListenerPauseTaskAction(
				"pause") {
			// {
			// setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
			// .getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
			// }

			public void run() {

				if (((IStructuredSelection) performanceTreeViewer
						.getSelection()).toArray().length != 0) {
					for (Object item : ((IStructuredSelection) performanceTreeViewer
							.getSelection()).toArray()) {
						if (item instanceof Task) {

							((Task) item).setStatus(PAUSE);
						}

					}
				}
			}

		};
		action.setToolTipText("pause");
		action.setEnabled(false);
		performanceTreeViewer.addSelectionChangedListener(action);

		return action;
	}

	private Action createStopPerformanceAction() {
		BaseSelectionListenerStopTaskAction action = new BaseSelectionListenerStopTaskAction(
				"stop") {
			// {
			// setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
			// .getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
			// }

			public void run() {

				if (((IStructuredSelection) performanceTreeViewer
						.getSelection()).toArray().length != 0) {
					for (Object item : ((IStructuredSelection) performanceTreeViewer
							.getSelection()).toArray()) {
						if (item instanceof Task) {

							((Task) item).setStatus(STOP);
						}

					}
				}
			}

		};
		action.setToolTipText("stop");
		action.setEnabled(false);
		performanceTreeViewer.addSelectionChangedListener(action);

		return action;
	}

	private void createViewer(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		TreeColumnLayout columnLayout = new TreeColumnLayout();
		composite.setLayout(columnLayout);
		performanceTreeViewer = new TreeViewer(composite, SWT.FULL_SELECTION);

		TreeViewerColumn name = new TreeViewerColumn(performanceTreeViewer,
				SWT.LEFT);
		performanceTreeViewer.getTree().setLinesVisible(true);
		performanceTreeViewer.getTree().setHeaderVisible(true);
		name.getColumn().setText("Task");
		columnLayout.setColumnData(name.getColumn(), new ColumnWeightData(10));
		nameLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof User) {
					return COMMON;
				} else if (element instanceof Task) {
					return ((Task) element).getName();
				} else
					return null;
			}

			@Override
			public Image getImage(Object element) {

				return super.getImage(element);
			}
		};
		name.setLabelProvider(nameLabelProvider);

		TreeViewerColumn during = new TreeViewerColumn(performanceTreeViewer,
				SWT.LEFT);
		performanceTreeViewer.getTree().setLinesVisible(true);
		performanceTreeViewer.getTree().setHeaderVisible(true);
		during.getColumn().setText("During");
		columnLayout.setColumnData(during.getColumn(), new ColumnWeightData(5));
		duringLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof User) {
					return Double.toString(((User) element).getParameters()
							.getTimeActive());

				} else if (element instanceof Task) {
					return Double.toString(((Task) element).getParameters()
							.getTimeActive());
				} else
					return null;
			}
		};
		name.setEditingSupport(new EditingSupport(performanceTreeViewer ) {
			@Override
			protected void setValue(Object element, Object value) {
				if (element instanceof Task) {
					((Task) element).setName((String) value);
					performanceTreeViewer.update(element, null);
				}
			}

			@Override
			protected Object getValue(Object element) {
				if (element instanceof Task) {
					String nameValue = ((Task) element)
							.getName();
					if (nameValue == null) {
						return "";
					} else {
						return nameValue;
					}
				} else
					return "";
			}

			@Override
			protected CellEditor getCellEditor(Object element) {

				return new TextCellEditor((Composite) getViewer().getControl(),
						SWT.LEFT);
			}

			@Override
			protected boolean canEdit(Object element) {
				if (element instanceof Task)
					return true;
				else
					return false;
			}
		});
		during.setLabelProvider(duringLabelProvider);

		TreeViewerColumn status = new TreeViewerColumn(performanceTreeViewer,
				SWT.LEFT);
		performanceTreeViewer.getTree().setLinesVisible(true);
		performanceTreeViewer.getTree().setHeaderVisible(true);
		status.getColumn().setText("Status");
		columnLayout.setColumnData(status.getColumn(), new ColumnWeightData(1));
		statusLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Task) {
					return ((Task) element).getStatus();
				} else
					return null;
			}

			@Override
			public Image getImage(Object element) {

				return super.getImage(element);
			}
		};
		status.setLabelProvider(statusLabelProvider);
		status.setEditingSupport(new EditingSupport(performanceTreeViewer) {
			@Override
			protected void setValue(Object element, Object value) {
				if (value.equals(0)) {
					((Task) element).setStatus(START);
				} else if (value.equals(1)) {
					((Task) element).setStatus(PAUSE);
				} else if (value.equals(2)) {
					((Task) element).setStatus(STOP);
				}

				performanceTreeViewer.update(element, null);
			}

			@Override
			protected Object getValue(Object element) {

				if (element instanceof Task) {
					if (((Task) element).getStatus().equals(START)) {
						return 0;
					} else if (((Task) element).getStatus().equals(PAUSE)) {
						return 1;
					} else if (((Task) element).getStatus().equals(STOP)) {
						return 2;
					}

				}
				return "";
			}

			@Override
			protected CellEditor getCellEditor(Object element) {

				return new ComboBoxCellEditor((Composite) getViewer()
						.getControl(), new String[] { START, PAUSE, STOP },
						SWT.LEFT_TO_RIGHT);
			}

			@Override
			protected boolean canEdit(Object element) {
				if (element instanceof Task)
					return true;
				return false;
			}
		});

		performanceTreeViewer
				.setContentProvider(new ObservableListTreeContentProvider(
						new PerfomanceTreeFactoryImpl(), null));

		performanceTreeViewer.setInput(performance);
	//	item.setControl(composite);

	}

	private void createTask(String name, String description) {
		Task newTask = UserPerformanceFactory.eINSTANCE.createTask();
		newTask.setName(name);
		newTask.setDescription(description);
		newTask.setStatus(START);
		newTask.setDateStart(Calendar.getInstance().getTime());
		Parameters parameters = UserPerformanceFactory.eINSTANCE
				.createParameters();
		newTask.setParameters(parameters);
		for (Task task : user.getTasks()) {
			if (task.getStatus().equals(START)) {
				task.setStatus(PAUSE);
				break;
			}
			for (Task subtask : task.getSubtasks()) {

				if (subtask.getStatus().equals(START)) {
					subtask.setStatus(PAUSE);
					break;
				}
			}
		}
		if (((IStructuredSelection) performanceTreeViewer.getSelection())
				.toArray().length != 0) {
			for (Object item : ((IStructuredSelection) performanceTreeViewer
					.getSelection()).toArray()) {
				if (item instanceof Task) {

					Task addTask = (Task) item;
					addTask.getSubtasks().add(newTask);
				} else {
					user.getTasks().add(newTask);
				}

			}
		} else {
			user.getTasks().add(newTask);
		}
		user.getTasks().get(0).getParameters().getTimeActive();
		performanceTreeViewer.expandAll();
	}

	private void createButtons(Composite parent) {
		Composite compositeWithButtons = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(false, true)
				.applyTo(compositeWithButtons);
		GridLayoutFactory.swtDefaults().numColumns(1)
				.applyTo(compositeWithButtons);
		Button add = createPushButton(compositeWithButtons, null, null);
		add.setText("Add");
		add.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				AddTaskDialog newTaskDialog = new AddTaskDialog(Display
						.getDefault().getActiveShell());
				newTaskDialog.setShellTitle("New Task");

				if (newTaskDialog.open() == IDialogConstants.OK_ID) {

					createTask(newTaskDialog.getName(),
							newTaskDialog.getDescription());
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		removeButton = createPushButton(compositeWithButtons, null, null);
		removeButton.setText("Remove");
		removeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				remove();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		upButton = createPushButton(compositeWithButtons, null, null);
		upButton.setText("Up");
		upButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				up();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		downButton = createPushButton(compositeWithButtons, null, null);
		downButton.setText("Down");
		downButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				down();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		moreButton = createPushButton(compositeWithButtons, null, null);
		moreButton.setText("About");
		moreButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				moreInfo();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});
//item.setControl(compositeWithButtons);
	}

	private void moreInfo() {
		for (Object item : ((IStructuredSelection) performanceTreeViewer
				.getSelection()).toArray()) {
			TaskDescriptionDialog newTaskDialog = new TaskDescriptionDialog(
					Display.getDefault().getActiveShell(), item);
			newTaskDialog.setShellTitle("Task deskription");

			if (newTaskDialog.open() == IDialogConstants.OK_ID) {

				if (item instanceof Task) {

					Task task = (Task) item;
					task.setName(newTaskDialog.getName());
					task.setDescription(newTaskDialog.getDescription());

				}
			}
			performanceTreeViewer.expandAll();
			newTaskDialog.getName();
			newTaskDialog.getDescription();
		}
	}

	private Button createPushButton(Composite parent, String label, Image image) {
		Button button = new Button(parent, SWT.PUSH);
		button.setFont(parent.getFont());
		if (image != null) {
			button.setImage(image);
		}
		if (label != null) {
			button.setText(label);
		}
		GridData gd = new GridData();
		button.setLayoutData(gd);
		setButtonDimensionHint(button);
		return button;
	}

	private static void setButtonDimensionHint(Button button) {
		Assert.isNotNull(button);
		Object gd = button.getLayoutData();
		if (gd instanceof GridData) {
			((GridData) gd).widthHint = getButtonWidthHint(button);
			((GridData) gd).horizontalAlignment = GridData.FILL;
		}
	}

	private static int getButtonWidthHint(Button button) {

		PixelConverter converter = new PixelConverter(button);
		int widthHint = converter
				.convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
		return Math.max(widthHint,
				button.computeSize(SWT.DEFAULT, SWT.DEFAULT, true).x);
	}

	private void up() {
		for (Object item : ((IStructuredSelection) performanceTreeViewer
				.getSelection()).toArray()) {
			if (item instanceof Task) {
				Task task = (Task) item;
				if (task.eContainer() instanceof User) {
					User user = (User) task.eContainer();
					EList<Task> tasks = user.getTasks();
					for (int i = 0; i < tasks.size(); i++) {
						if (item.equals(tasks.get(i)) && (i > 0)) {
							Task temp = tasks.get(i - 1);
							Task temp1 = tasks.get(i);
							Task newTask = UserPerformanceFactory.eINSTANCE
									.createTask();
							Parameters par = UserPerformanceFactory.eINSTANCE
									.createParameters();
							newTask.setParameters(par);
							tasks.set(i, newTask);
							tasks.set(i - 1, temp1);
							tasks.set(i, temp);
						}

					}
				} else if (task.eContainer() instanceof Task) {
					Task parentTask = (Task) task.eContainer();
					EList<Task> subtasks = parentTask.getSubtasks();
					for (int i = 0; i < subtasks.size(); i++) {
						if (item.equals(subtasks.get(i)) && (i > 0)) {
							Task temp = subtasks.get(i - 1);
							Task temp1 = subtasks.get(i);
							Task newTask = UserPerformanceFactory.eINSTANCE
									.createTask();
							Parameters par = UserPerformanceFactory.eINSTANCE
									.createParameters();
							newTask.setParameters(par);
							subtasks.set(i, newTask);
							subtasks.set(i - 1, temp1);
							subtasks.set(i, temp);
						}

					}
				}
			}
		}
		performanceTreeViewer.expandAll();
	}

	private void remove() {
		for (Object item : ((IStructuredSelection) performanceTreeViewer
				.getSelection()).toArray()) {
			if (item instanceof Task) {

				Task removeTask = (Task) item;
				EObject container = removeTask.eContainer();
				if (container instanceof User) {
					User userContainer = (User) container;
					userContainer.getTasks().remove(removeTask);
				} else if (container instanceof Task) {
					Task taskContainer = (Task) container;
					taskContainer.getSubtasks().remove(removeTask);
				}
			}
		}
		performanceTreeViewer.expandAll();

	}

	private void down() {
		for (Object item : ((IStructuredSelection) performanceTreeViewer
				.getSelection()).toArray()) {
			if (item instanceof Task) {
				Task task = (Task) item;
				if (task.eContainer() instanceof User) {
					User user = (User) task.eContainer();
					EList<Task> tasks = user.getTasks();
					for (int i = 0; i < tasks.size(); i++) {
						if (item.equals(tasks.get(i)) && i < (tasks.size() - 1)) {
							Task temp = tasks.get(i + 1);
							Task temp1 = tasks.get(i);
							Task newTask = UserPerformanceFactory.eINSTANCE
									.createTask();
							Parameters par = UserPerformanceFactory.eINSTANCE
									.createParameters();
							newTask.setParameters(par);
							tasks.set(i, newTask);
							tasks.set(i + 1, temp1);
							tasks.set(i, temp);
						}

					}
				} else if (task.eContainer() instanceof Task) {
					Task parentTask = (Task) task.eContainer();
					EList<Task> subtasks = parentTask.getSubtasks();
					for (int i = 0; i < subtasks.size(); i++) {
						if (item.equals(subtasks.get(i))
								&& i < (subtasks.size() - 1)) {
							Task temp = subtasks.get(i + 1);
							Task temp1 = subtasks.get(i);
							Task newTask = UserPerformanceFactory.eINSTANCE
									.createTask();
							Parameters par = UserPerformanceFactory.eINSTANCE
									.createParameters();
							newTask.setParameters(par);
							subtasks.set(i, newTask);
							subtasks.set(i + 1, temp1);
							subtasks.set(i, temp);
						}

					}
				}
			}
		}
		performanceTreeViewer.expandAll();
	}

}
