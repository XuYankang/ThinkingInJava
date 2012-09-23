package com.jacob.comcurrency;

public class Ex1C implements Runnable {
	public Ex1C() {
		System.out.println("Constructing Ex1C...");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hi from Ex1C");
			Thread.yield();
		}
		System.out.println("End task Ex1C");
		return;
	}

}
