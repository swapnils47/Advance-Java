package com.jspiders.singleton.object;

public class SingletonLazy {

	static SingletonLazy Object;
	
	private SingletonLazy() {
		System.out.println("Constructor Accessed.");
	}
	
	public static SingletonLazy getObject() {
		System.out.println("Method Accessed.");
		if (Object == null) {
			Object=new SingletonLazy();
		}
		return Object;
	}
}
