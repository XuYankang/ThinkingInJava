package com.jacob.comcurrency;

public class Ex2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Ex2A(15));
		Thread t2 = new Thread(new Ex2A(15));
		Thread t3 = new Thread(new Ex2A(15));
		Thread t4 = new Thread(new Ex2A(15));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
