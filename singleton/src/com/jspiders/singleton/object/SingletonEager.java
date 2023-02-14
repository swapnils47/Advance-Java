package com.jspiders.singleton.object;

public class SingletonEager {

	static SingletonEager  Object=new SingletonEager();
	
	private SingletonEager() {
		System.out.println("Constructor Accessed");
	}
	
	public static SingletonEager getObject() {
		System.out.println("Method Accessed.");
		return Object;
	}
}
