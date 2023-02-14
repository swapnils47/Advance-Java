package com.jspider.multithreding.threadmain;

import com.jspider.multithreding.thread.MyThread1;
import com.jspider.multithreding.thread.MyThread2;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread=new Thread(myThread2);
		 MyThread1 myThread1=new MyThread1();
         myThread1.start();
         thread.start();
	}
}
