package com.jspiders.multithreadingpropertieswaitandnotify.thread;

import com.jspiders.multithreadingpropertieswaitandnotify.resource.Pizza;

public class Dominos extends Thread {
	private Pizza pizza;

	public Dominos(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.makePizza(10);
	}
}
