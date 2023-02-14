package com.jspiders.multithreadingpropertieswaitandnotifyimplementation.resource;

public class Biryani {

	int noOfBiryani;
	public synchronized void orderBiryani(int orderedBiryani) {
		System.out.println("Ordering "+orderedBiryani+" Biryani");
		if (orderedBiryani > noOfBiryani) {
			System.out.println(orderedBiryani+" Biryani not available");
            System.out.println("Please wait..!");
            try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		noOfBiryani -=orderedBiryani;
		System.out.println("Order of "+orderedBiryani+" Biryanies are successfull");
	}
	public synchronized void makeBiryani(int biryaniPlates) {
		System.out.println("Making "+biryaniPlates+" Biryani");
		noOfBiryani += biryaniPlates;
		System.out.println(biryaniPlates+" Biryani available");
		this.notify();
	}
}
