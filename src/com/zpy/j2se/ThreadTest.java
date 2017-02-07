package com.zpy.j2se;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("t1 start");
		});
		t1.start();
	}
}
