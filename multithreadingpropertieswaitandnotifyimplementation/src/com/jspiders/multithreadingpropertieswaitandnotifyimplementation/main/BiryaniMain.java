package com.jspiders.multithreadingpropertieswaitandnotifyimplementation.main;

import com.jspiders.multithreadingpropertieswaitandnotifyimplementation.resource.Biryani;
import com.jspiders.multithreadingpropertieswaitandnotifyimplementation.thread.Friends;
import com.jspiders.multithreadingpropertieswaitandnotifyimplementation.thread.Hotel;

public class BiryaniMain {

	public static void main(String[] args) {
		Biryani biryani=new Biryani();
		
		Friends friends=new Friends(biryani);
		Hotel hotel=new Hotel(biryani);
		
		friends.start();
		hotel.start();
		
	}
}
