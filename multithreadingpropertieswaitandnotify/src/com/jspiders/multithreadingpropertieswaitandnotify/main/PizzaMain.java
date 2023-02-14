package com.jspiders.multithreadingpropertieswaitandnotify.main;

import com.jspiders.multithreadingpropertieswaitandnotify.resource.Pizza;
import com.jspiders.multithreadingpropertieswaitandnotify.thread.Dominos;
import com.jspiders.multithreadingpropertieswaitandnotify.thread.Friends;

public class PizzaMain {
 public static void main(String[] args) {
	Pizza pizza=new Pizza();
	
	Friends friends=new Friends(pizza);
	Dominos dominos=new Dominos(pizza);
	
	friends.start();
	dominos.start();
 }
}
