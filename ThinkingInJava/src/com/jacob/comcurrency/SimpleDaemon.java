package com.jacob.comcurrency;

import java.util.concurrent.TimeUnit;

public class SimpleDaemon implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("sleep() interrupt");
			}
			System.out.println(Thread.currentThread() + " " + this);
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemon());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("All deamons started");
		TimeUnit.MILLISECONDS.sleep(1000);
	}
}
