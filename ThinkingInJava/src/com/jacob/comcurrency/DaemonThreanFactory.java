package com.jacob.comcurrency;

import java.util.concurrent.ThreadFactory;

public class DaemonThreanFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		return t;
	}

}
