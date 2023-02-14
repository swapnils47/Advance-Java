package com.jspiders.multithreadingproperties.thread;

public class MyThread1  extends Thread {
	@Override
	public void run() {
		System.out.println("The Name of the Thread is " + this.getName());
		System.out.println("The Priority of the Thread is " + this.getPriority());
	}
}
