package com.jspiders.multithreadingpropertieswaitandnotifyimplementation.thread;

import com.jspiders.multithreadingpropertieswaitandnotifyimplementation.resource.Biryani;

public class Hotel extends Thread {

	private Biryani biryani;

	
	public Hotel(Biryani biryani) {
		this.biryani = biryani;
	}


	@Override
	public void run() {
		biryani.makeBiryani(5);
	}
}
