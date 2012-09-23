package com.jacob.comcurrency;

import java.util.concurrent.Callable;

public class Ex5A implements Callable<Integer> {

	private int n = 0;

	public Ex5A(int n) {
		this.n = n;
	}

	private int fib(int x) {
		if (x < 2)
			return 1;
		else
			return fib(x - 2) + fib(x - 1);
	}

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += fib(i);
		}
		return (Integer) result;
	}
}
