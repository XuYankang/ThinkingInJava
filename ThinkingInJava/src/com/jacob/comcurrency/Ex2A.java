package com.jacob.comcurrency;

public class Ex2A implements Runnable {
	private int n;

	public Ex2A(int n) {
		this.n = n;
	}

	private int fib(int x) {
		if (x < 2) {
			return 1;
		} else {
			return fib(x - 2) + fib(x - 1);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println(fib(i) + " \n");
		}
	}

}
