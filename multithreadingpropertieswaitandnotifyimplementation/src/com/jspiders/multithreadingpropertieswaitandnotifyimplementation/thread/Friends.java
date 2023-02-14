package com.jspiders.multithreadingpropertieswaitandnotifyimplementation.thread;

import com.jspiders.multithreadingpropertieswaitandnotifyimplementation.resource.Biryani;

public class Friends extends Thread {

	private Biryani biryani;

	public Friends(Biryani biryani) {
		this.biryani = biryani;
	}
	@Override
	public void run() {
		biryani.orderBiryani(5);
	}
}
