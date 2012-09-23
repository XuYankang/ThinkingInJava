package com.jacob.comcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex10Fibonacci implements Callable<Integer> {

	private Integer n = 0;
	ExecutorService exec = Executors.newSingleThreadExecutor();

	private int fib(int x) {
		if (x < 2)
			return 1;
		return fib(x - 2) + fib(x - 1);
	}

	public Integer call() {
		int result = 0;
		for (int i = 0; i < n; i++)
			result += fib(i);
		return (Integer) result;
	}

	public Future<Integer> runTask(Integer n) {
		this.n = n;
		return exec.submit(this);
	}

}
