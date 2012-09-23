package com.jacob.comcurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex5 {

	public static void main(String[] args) {
		ExecutorService exer = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 20; i++) {
			results.add(exer.submit(new Ex5A(i)));
		}
		for (Future<Integer> fs : results) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}finally{
				exer.shutdown();
			}
		}
	}
}
