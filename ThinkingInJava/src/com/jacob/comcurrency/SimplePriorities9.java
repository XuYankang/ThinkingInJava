package com.jacob.comcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities9 implements Runnable {
	private int countDown = 5;
	private volatile double d;

	public String toString() {
		return Thread.currentThread() + " " + countDown;
	}

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 10000; i++) {
				d += (Math.PI + Math.E) / (double) i;
				if (i % 1000 == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors
				.newCachedThreadPool(new SimplePriorities9ThreadFactory());
		for (int i = 0; i < 5; i++)
			exec.execute(new SimplePriorities9());
		exec.equals(new SimplePriorities9());
		exec.shutdown();
	}

}
