package com.jacob.comcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
	protected static int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {

	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "),";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.err.println(status());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 5; i++) { Thread t = new Thread(new LiftOff());
		 * t.start(); } System.out.println("Waiting for LiftOff");
		 */

		/*
		 * ExecutorService exer = Executors.newCachedThreadPool(); for (int i =
		 * 0; i < 5; i++) { exer.execute(new LiftOff()); } exer.shutdown();
		 */
		//
		// ExecutorService exer = Executors.newFixedThreadPool(5);
		// for (int i = 0; i < 5; i++) {
		// exer.execute(new LiftOff());
		// }
		// exer.shutdown();

		ExecutorService exer = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exer.execute(new LiftOff());
		}
		exer.shutdown();

	}

}
