package com.jspiders.factory.main;

import java.util.Scanner;

import com.jspiders.factory.bevarage.Bevarage;
import com.jspiders.factory.object.BlackTea;
import com.jspiders.factory.object.LemonTea;
import com.jspiders.factory.object.MasalaTea;
import com.jspiders.factory.object.Tea;

public class TeaFactory {

	static Bevarage bevarage;

	public static void main(String[] args) {

		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No Tea Selected");
		}
	}

	private static Bevarage factory() {
		System.out.println("Select Tea To Oredr");
		System.out.println("1.Tea\n" + "2.Black Tea\n" + "3.Ginger Tea\n" + "4.Masala Tea");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			bevarage = new Tea();
			return bevarage;

		case 2:
			bevarage = new BlackTea();
			return bevarage;

		case 3:
			bevarage = new LemonTea();
			return bevarage;
			
		case 4:
			bevarage = new MasalaTea();
			return bevarage;
			
		default:
			System.out.println("Invalid choice");
			return bevarage;
		}
	}
}
