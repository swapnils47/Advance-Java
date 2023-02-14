package com.jspiders.multithreadingpropertieswaitandnotify.thread;

import com.jspiders.multithreadingpropertieswaitandnotify.resource.Pizza;

public class Friends extends Thread {

	private Pizza pizza;

	public Friends(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.orderPizza(5);
	}
}
