package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.builder.ContactBuilder;
import com.jspiders.builderdesignpattern.object.Contact;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact contact=new ContactBuilder().mobile_no(476465l).last_name("Sharma").first_name("Rohit").getContact();
		System.out.println(contact);
	}
}
