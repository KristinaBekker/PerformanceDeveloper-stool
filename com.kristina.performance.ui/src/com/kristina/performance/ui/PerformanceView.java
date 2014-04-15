package com.kristina.performance.ui;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.set.ComputedSet;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
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
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import UserPerformance.Interval;
import UserPerformance.Parameters;
import UserPerformance.Performance;
import UserPerformance.Task;
import UserPerformance.User;
import UserPerformance.UserPerformanceFactory;

import com.kristina.performance.core.IUserPerformanceModelLister;
import com.kristina.performance.core.PerformanceModel;

public class PerformanceView extends ViewPart {
	protected static final String COMMON = "Common";
	private static final String PAUSE = "pause";
	private static final String START = "start";
	private static final String STOP = "stop";

	private Performance performance = PerformanceModel.getInstance()
			.getPerformance();

	// private Action removePerformanceAction;
	private Action startPerformanceAction;
	private Action pausevePerformanceAction;
	private Action stopPerformanceAction;

	private Date start = Calendar.getInstance().getTime();
	private Date end = Calendar.getInstance().getTime();
	private IObservableValue stopValue = new WritableValue(start, Boolean.TYPE);
	private IObservableValue startValue = new WritableValue(start, null);
	

	private TreeViewer performanceTreeViewer;
	private TreeViewer byDateTreeViewer;

	private User user = performance.getUsers();



	private Text taskName;
	private Text taskDescription;
	private Text activeTime;

	private Button removeButton;
	private Button upButton;
	private Button downButton;
	private Button moreButton;

	private DataBindingContext dbc = new DataBindingContext();

	private ColumnLabelProvider nameLabelProvider;
	private AsyncLabelProvider asyncDuringLabelProvider;
	private ColumnLabelProvider statusLabelProvider;
	private ColumnLabelProvider duringLabelProvider;

	public PerformanceView() {

		super();
	}

	public void setFocus() {

	}

	public void createPartControl(Composite parent) {

		
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);
		TabFolder composite = new TabFolder(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		TabItem mainTab = new TabItem(composite, SWT.NULL);
		mainTab.setText("Main");
		TabItem byDateTab = new TabItem(composite, SWT.NULL);
		byDateTab.setText("By date");
		Composite mainGeneralTabControl = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1)
				.applyTo(mainGeneralTabControl);
		Composite mainArchivelTabControl = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1)
				.applyTo(mainArchivelTabControl);
		GridDataFactory.fillDefaults().grab(true, true)
				.applyTo(mainGeneralTabControl);
		mainTab.setControl(mainGeneralTabControl);
		byDateTab.setControl(mainArchivelTabControl);
		start = Calendar.getInstance().getTime();
		  end = Calendar.getInstance().getTime();
		 stopValue = new WritableValue(start, Boolean.TYPE);
	 startValue = new WritableValue(start, null);
		Composite mainFirstTabControl = new Composite(mainGeneralTabControl,
				SWT.NONE);
		GridDataFactory.fillDefaults().grab(false, false)
				.applyTo(mainFirstTabControl);
		addStartedTaskDescription(mainFirstTabControl);
		createTimeViewer(mainFirstTabControl);
		final PerformanceCalendar date = new PerformanceCalendar(
				mainFirstTabControl, SWT.NONE);
		final ICalendarListener listener = new ICalendarListener() {

			@Override
			public void setValue(final Date start, final Date end) {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								setStart(start);
								setEnd(end);

							}
						});

			}
		};
		date.calendarListeners.add(listener);

		date.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {
				date.calendarListeners.remove(listener);
			}
		});
		;

		GridDataFactory.fillDefaults().grab(true, true).applyTo(date);
		Composite mainSecondTabControl = new Composite(mainArchivelTabControl,
				SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2)
				.applyTo(mainSecondTabControl);
		GridDataFactory.fillDefaults().grab(true, true)
				.applyTo(mainSecondTabControl);

		createCommonViewer(mainSecondTabControl);
		createButtons(mainSecondTabControl);
		createActions();
		createModelListener();

		createDataBinding(dbc);

	}

	private void createModelListener() {
		final IUserPerformanceModelLister modelListener = new IUserPerformanceModelLister() {

			@Override
			public void modifyed() {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {

								setDescription();
							}
						});
			};

			@Override
			public void taskModifyed(final Task task) {

				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {

								performanceTreeViewer.refresh(task);
							}
						});
			}

			@Override
			public void userModifyed(final User user) {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {

								performanceTreeViewer.refresh(user);
							}
						});
			}

			@Override
			public void taskNameModifyed(final Task task, final String value) {

				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								Task startedTask = null;
								if (!user.getTasks().isEmpty()) {
									for (Task task : user.getTasks()) {
										if (task.getStatus().equals(START)) {
											startedTask = searchStartedTask(task);

											break;
										}
									}
								}
								if (startedTask == null) {
									taskName.setText(user.getName());
								} else {
									if (task.equals(startedTask)) {
										taskName.setText(value);
									}
								}
							}
						});

			}

			@Override
			public void taskStatusModifyed() {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								setDescription();
							}

						});

			}

			@Override
			public void taskDescriptionModifyed(final Task task,
					final String value) {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								Task startedTask = null;
								if (!user.getTasks().isEmpty()) {
									for (Task task : user.getTasks()) {
										if (task.getStatus().equals(START)) {
											startedTask = searchStartedTask(task);

											break;
										}
									}
								}
								if (startedTask == null) {
									taskDescription.setText(user
											.getDescriptoin());
								} else {
									if (task.equals(startedTask)) {
										taskDescription.setText(value);
									}
								}
							}
						});

			}

			@Override
			public void taskTimeActiveModifyed(final Task task,
					final double value) {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								Task startedTask = null;
								if (!user.getTasks().isEmpty()) {
									for (Task task : user.getTasks()) {
										if (task.getStatus().equals(START)) {
											startedTask = searchStartedTask(task);

											break;
										}
									}
								}
								if (startedTask == null) {
									activeTime.setText(Double.toString(user
											.getParameters().getTimeActive()));
								} else {
									if (task.equals(startedTask)) {
										activeTime.setText(Double
												.toString(value));
										// taskDescription.setText(value);
									}
								}
							}
						});

			}

			@Override
			public void userTimeActiveModifyed(double newDoubleValue) {
				performanceTreeViewer.getControl().getDisplay()
						.asyncExec(new Runnable() {

							@Override
							public void run() {
								Task startedTask = null;
								if (!user.getTasks().isEmpty()) {
									for (Task task : user.getTasks()) {
										if (task.getStatus().equals(START)) {
											startedTask = searchStartedTask(task);

											break;
										}
									}
								}
								if (startedTask == null) {
									activeTime.setText(Double.toString(user
											.getParameters().getTimeActive()));
								}
							}
						});

			}

		};
		PerformanceModel.getInstance().getlisteners().add(modelListener);

		performanceTreeViewer.getControl().addDisposeListener(
				new DisposeListener() {

					@Override
					public void widgetDisposed(DisposeEvent e) {
						PerformanceModel.getInstance().getlisteners()
								.remove(modelListener);
					}
				});

	}

	private void setDescription() {
		Task startedTask = null;
		if (!user.getTasks().isEmpty()) {
			for (Task task : user.getTasks()) {
				if (task.getStatus().equals(START)) {
					startedTask = searchStartedTask(task);

					break;
				}
			}
		}
		if (startedTask == null) {
			taskName.setText(user.getName());
			taskDescription.setText(user.getDescriptoin());
			activeTime.setText(Double.toString(user.getParameters()
					.getTimeActive()));

		} else {
			taskName.setText(startedTask.getName());
			taskDescription.setText(startedTask.getDescription());
			activeTime.setText(Double.toString(startedTask.getParameters()
					.getTimeActive()));
		}

	}

	private void addStartedTaskDescription(Composite mainFirstTabControl) {

		GridLayout layout = new GridLayout(2, false);

		mainFirstTabControl.setLayout(layout);

		Label lbtFirstName = new Label(mainFirstTabControl, SWT.NONE);
		lbtFirstName.setText("Name");

		GridData dataTaskName = new GridData();
		dataTaskName.grabExcessHorizontalSpace = true;
		dataTaskName.horizontalAlignment = GridData.FILL;

		taskName = new Text(mainFirstTabControl, SWT.BORDER);
		taskName.setLayoutData(dataTaskName);

		Label lbtDescription = new Label(mainFirstTabControl, SWT.NONE);
		lbtDescription.setText("Description");

		GridData dataDescription = new GridData();
		dataDescription.grabExcessHorizontalSpace = true;
		dataDescription.horizontalAlignment = GridData.FILL;
		taskDescription = new Text(mainFirstTabControl, SWT.BORDER);
		taskDescription.setLayoutData(dataDescription);

		Label lbtTimeActive = new Label(mainFirstTabControl, SWT.NONE);
		lbtTimeActive.setText("Active time");

		GridData dataTaskParameter = new GridData();
		dataTaskParameter.grabExcessHorizontalSpace = false;

		activeTime = new Text(mainFirstTabControl, SWT.BORDER);
		activeTime.setLayoutData(dataTaskParameter);
		setDescription();

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

		// removePerformanceAction = createRemovePerformanceAction();
		startPerformanceAction = createStartPerformanceAction();
		pausevePerformanceAction = createPausePerformanceAction();
		stopPerformanceAction = createStopPerformanceAction();

		toolBarManager.add(fAddPerformanceAction);

		// toolBarManager.add(removePerformanceAction);
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
					// manager.add(removePerformanceAction);
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

	// private Action createRemovePerformanceAction() {
	// BaseSelectionListenerRemoveTaskAction action = new
	// BaseSelectionListenerRemoveTaskAction(
	// "remove") {
	// {
	// setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
	// .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
	// }
	//
	// public void run() {
	// for (Object item : ((IStructuredSelection) performanceTreeViewer
	// .getSelection()).toArray()) {
	// if (item instanceof Task) {
	//
	// Task removeTask = (Task) item;
	// EObject container = removeTask.eContainer();
	// if (container instanceof User) {
	// User userContainer = (User) container;
	// userContainer.getTasks().remove(removeTask);
	// } else if (container instanceof Task) {
	// Task taskContainer = (Task) container;
	// taskContainer.getSubtasks().remove(removeTask);
	// }
	// }
	// }
	// performanceTreeViewer.expandAll();
	// }
	// };
	// action.setToolTipText("remove");
	// action.setEnabled(false);
	// performanceTreeViewer.addSelectionChangedListener(action);
	//
	// return action;
	// }

	private Action createAddPerformanceAction() {
		Action action = new Action("add") {
			{
				setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
						.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
			}

			public void run() {

				createTaskDialog();
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

				if (((IStructuredSelection) performanceTreeViewer
						.getSelection()).toArray().length != 0) {
					for (Object item : ((IStructuredSelection) performanceTreeViewer
							.getSelection()).toArray()) {
						if (item instanceof Task) {
							Task task = (Task) item;
							startStaus(task);
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

							// ((Task) item).setStatus(PAUSE);
							setTaskStatus((Task) item, PAUSE);
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
							setTaskStatus((Task) item, STOP);
							// ((Task) item).setStatus(STOP);
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

	private void createTimeViewer(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		TreeColumnLayout columnLayaut = new TreeColumnLayout();
		composite.setLayout(columnLayaut);
		byDateTreeViewer = new TreeViewer(composite, SWT.FULL_SELECTION);
		// TreeViewerColumn name = new TreeViewerColumn(byDateTreeViewer,
		// SWT.LEFT);
		byDateTreeViewer.getTree().setLinesVisible(true);
		byDateTreeViewer.getTree().setHeaderVisible(true);

		// name.getColumn().setText("Task");
		// columnLayaut.setColumnData(name.getColumn(), new
		// ColumnWeightData(10));

		TreeViewerColumn during = new TreeViewerColumn(byDateTreeViewer,
				SWT.LEFT);
		during.getColumn().setText("during");
		columnLayaut.setColumnData(during.getColumn(), new ColumnWeightData(4));

		IObservableSet intervals = new ComputedSet() {

			@Override
			protected Set calculate() {
				Object t = startValue.getValue();
				Object d = stopValue.getValue();
				EList<Interval> interv = user.getIntervals();

				HashSet<Interval> set = new HashSet<Interval>();
				for (Interval i : interv) {
					set.add(i);
					
				}
				return set;
			}
		};
		
		
		asyncDuringLabelProvider = new AsyncLabelProvider(intervals) {

		};
		during.setLabelProvider(asyncDuringLabelProvider);

		// ViewerFilter[] filters = new ViewerFilter[1] ;
		// ViewerFilter filter = new ViewerFilter() {
		//
		// @Override
		// public boolean select(Viewer viewer, Object parentElement, Object
		// element) {
		// // TODO Auto-generated method stub
		// return false;
		// }
		// };
		// filters[0] = filter;
		// byDateTreeViewer.setFilters(filters );
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
				new PerfomanceTreeFactoryImpl(), null);
		contentProvider.getKnownElements();
		byDateTreeViewer.setContentProvider(contentProvider);
		byDateTreeViewer.setInput(performance);

	}

	private void createCommonViewer(Composite parent) {

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
					return "";
			}

		};
		name.setLabelProvider(nameLabelProvider);

		TreeViewerColumn during = new TreeViewerColumn(performanceTreeViewer,
				SWT.LEFT);

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
		name.setEditingSupport(new EditingSupport(performanceTreeViewer) {
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
					String nameValue = ((Task) element).getName();
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
				// if (element instanceof Task)
				// return true;
				// else
				return false;
			}
		});
		during.setLabelProvider(duringLabelProvider);

		TreeViewerColumn status = new TreeViewerColumn(performanceTreeViewer,
				SWT.LEFT);

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
	}

	private void createTask(String name, String description) {
		Task newTask = UserPerformanceFactory.eINSTANCE.createTask();
		newTask.setName(name);
		newTask.setDescription(description);
		newTask.setDateStart(Calendar.getInstance().getTime());

		Parameters parameters = UserPerformanceFactory.eINSTANCE
				.createParameters();
		newTask.setParameters(parameters);

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
		startStaus(newTask);
		performanceTreeViewer.expandAll();
	}

	private void createButtons(Composite parent) {
		Composite compositeWithButtons = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(false, false)
				.applyTo(compositeWithButtons);
		GridLayoutFactory.swtDefaults().numColumns(1)
				.applyTo(compositeWithButtons);
		Button add = createPushButton(compositeWithButtons, null, null);
		// Button add = new Button(compositeWithButtons, SWT.PUSH);
		add.setText("Add");
		add.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createTaskDialog();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		removeButton = createPushButton(compositeWithButtons, null, null);
		// removeButton = new Button(compositeWithButtons, SWT.PUSH);
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
		// upButton = new Button(compositeWithButtons, SWT.PUSH);
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
		// downButton = new Button(compositeWithButtons, SWT.PUSH);
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
		// moreButton = new Button(compositeWithButtons, SWT.PUSH);
		moreButton.setText("Information");
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
		Object gd = button.getLayoutData();
		Assert.isNotNull(button);
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

	private void startStaus(Task task) {
		EObject container = task.eContainer();
		if (container instanceof Task) {
			for (Task subtask : ((Task) container).getSubtasks()) {

				if (subtask.getStatus().equals(START)
						&& !(subtask.equals(task))) {
					// subtask.setStatus(PAUSE);
					setTaskStatus(subtask, PAUSE);
					break;
				}
			}
			task.setStatus(START);
			startStaus(((Task) container));
		} else if (container instanceof User) {
			for (Task subtask : ((User) container).getTasks()) {

				if (subtask.getStatus().equals(START)
						&& !(subtask.equals(task))) {
					setTaskStatus(subtask, PAUSE);
					break;
				}
			}
			task.setStatus(START);
		}

	}

	private void setTaskStatus(Task task, String status) {

		task.setStatus(status);
		checkTaskStatus(task, status);

	}

	private void createTaskDialog() {
		AddTaskDialog newTaskDialog = new AddTaskDialog(Display.getDefault()
				.getActiveShell());
		newTaskDialog.setShellTitle("New Task");

		if (newTaskDialog.open() == IDialogConstants.OK_ID) {

			createTask(newTaskDialog.getName(), newTaskDialog.getDescription());
		}

	}

	private void checkTaskStatus(Task task, String status) {
		if (task.getSubtasks() != null) {
			for (Task subtask : task.getSubtasks()) {
				checkTaskStatus(subtask, status);
				subtask.setStatus(status);
			}
		}

	}

	private Task searchStartedTask(Task task) {

		if (!task.getSubtasks().isEmpty()) {
			for (Task subtask : task.getSubtasks()) {
				if (subtask.getStatus().equals(START)) {
					return searchStartedTask(subtask);
				}
			}
			return task;
		} else {

			return task;
		}
	}

	public void setStart(Date start) {
		this.start = start;
		startValue.getValue();
		System.err.println("");
	}

	public void setEnd(Date end) {
		this.end = end;
	}
}
