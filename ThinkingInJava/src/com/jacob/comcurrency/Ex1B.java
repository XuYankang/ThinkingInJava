package com.jacob.comcurrency;

public class Ex1B implements Runnable {
	public Ex1B() {
		System.out.println("Constructing Ex1B...");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hi from Ex1B");
			Thread.yield();
		}
		System.out.println("End task Ex1B");
		return;
	}

}
