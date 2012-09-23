package com.jacob.comcurrency;

import java.util.concurrent.ExecutionException;

public class Ex10a {
	public static void main(String[] args) {
		Ex10Fibonacci ef = new Ex10Fibonacci();

		try {
			for (int i = 0; i < 15; i++) {
				System.out.println("Sum of first" + i + " Fibonacci number=");
				System.out.println(ef.runTask(i).get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} finally {
			ef.exec.shutdown();
		}

	}
}
