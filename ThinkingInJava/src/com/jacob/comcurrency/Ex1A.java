package com.jacob.comcurrency;

public class Ex1A implements Runnable {
	public Ex1A() {
		System.out.println("Constructing Ex1A...");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hi from Ex1A");
			Thread.yield();
		}
		System.out.println("End task Ex1A");
		return;
	}

}
