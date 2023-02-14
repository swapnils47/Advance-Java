package com.jspiders.multithreadingproperties.thread;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("The name of thread is "+ Thread.currentThread().getName());
		System.out.println("The Priority of thread is "+ Thread.currentThread().getPriority());
		
	}

}
