package com.jspiders.multithreadingproperties.main;

import com.jspiders.multithreadingproperties.thread.MyThread1;
import com.jspiders.multithreadingproperties.thread.MyThread2;

public class ThreadMain1 {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("Thread 1");
		myThread1.setPriority(6);
		
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.setName("Thread 2");
		thread.setPriority(5);
		
		myThread1.start();
		thread.start();
	}
}
