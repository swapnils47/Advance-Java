package com.jspiders.multithreadingproperties.main;

import com.jspiders.multithreadingproperties.thread.MyThread1;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("Thread 1");
		myThread1.setPriority(8);
		myThread1.start();
		
	}
}
