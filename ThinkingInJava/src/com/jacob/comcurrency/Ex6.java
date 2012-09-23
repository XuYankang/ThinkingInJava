package com.jacob.comcurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex6 implements Runnable {
	Random random = new Random();

	@Override
	public void run() {
		int t = 1000 * random.nextInt(10);
		try {
			TimeUnit.MICROSECONDS.sleep(t);
			System.out.println("Slep " + t / 1000 + "Seconds");
			return;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please input a number");
		} else if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			ExecutorService exec = Executors.newCachedThreadPool();
			for (int i = 0; i < n; i++) {
				exec.execute(new Ex6());
			}
			exec.shutdown();
		}
	}

}
