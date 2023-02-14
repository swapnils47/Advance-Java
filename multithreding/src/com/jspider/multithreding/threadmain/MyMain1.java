package com.jspider.multithreding.threadmain;

import com.jspider.multithreding.thread.MyThread1;

public class MyMain1 {
	public static void main(String[] args) {
           MyThread1 myThread1=new MyThread1();
           myThread1.start();
	}
}
