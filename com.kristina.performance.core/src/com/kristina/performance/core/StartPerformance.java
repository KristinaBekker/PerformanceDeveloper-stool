package com.kristina.performance.core;

import org.eclipse.ui.IStartup;

public class StartPerformance implements IStartup {

	@Override
	public void earlyStartup() {
  		new PerformanceCore(PerformanceModel.getInstance().getPerformance());

	}
}
