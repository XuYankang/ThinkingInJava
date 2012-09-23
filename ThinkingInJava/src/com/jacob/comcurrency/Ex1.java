package com.jacob.comcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {

	public static void main(String[] args) {
		Thread ta = new Thread(new Ex1A());
		Thread tb = new Thread(new Ex1B());
		Thread tc = new Thread(new Ex1C());
		// ta.start();
		// tb.start();
		// tc.start();

		// ExecutorService exer = Executors.newSingleThreadExecutor();
		// exer.execute(ta);
		// exer.execute(tb);
		// exer.execute(tc);

		// ExecutorService exer = Executors.newSingleThreadScheduledExecutor();
		// exer.execute(ta);
		// exer.execute(tb);
		// exer.execute(tc);

		// ExecutorService exer = Executors.newFixedThreadPool(2);
		// exer.execute(ta);
		// exer.execute(tb);
		// exer.execute(tc);

		ExecutorService exer = Executors.newScheduledThreadPool(1);
		exer.execute(ta);
		exer.execute(tb);
		exer.execute(tc);

	}

}
