package multiplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {
	static int choice;
	static boolean loop = true;

	// while(loop==true) {
	public static void playSong() {

		System.out.println("1.Play All Song" + "\n" + "2.choose Song" + "\n" + "3.Play random" + "\n" + "4.Go Back");
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			Song s1 = new Song();
			s1.setId(1);
			s1.setDuration("5min");
			s1.setMovies("om shanti om");
			s1.setName("tu mako paya");
			s1.setSinger("shriya");

			Song s2 = new Song();
			s2.setId(2);
			s2.setDuration("6min");
			s2.setMovies("tiger");
			s2.setName("ek tha tiger");
			s2.setSinger("kk");

			ArrayList l = new ArrayList();
			l.add(s1);
			l.add(s2);
			System.out.println("play all song");
			System.out.println(l);
			break;
		case 2:
			System.out.println("choose song sucssefully play");
//					ArrayList l1=new ArrayList();
//					l1.add(s1);			
			break;
		case 3:
			System.out.println("random song sucssefully play");
			break;
		case 4:
			loop = false;
			break;
		default:
			System.out.println("invalid number");
			break;

		}
	}

	public static void addRemoveSong() {

		System.out.println("1.Add Song" + "\n" + "2.remove Song" + "\n" + "3.exit");
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Add Song");
			break;

		case 2:
			System.out.println("remove song");
			break;
		case 3:
			System.out.println("exit");
			loop = false;
			break;

		default:
			System.out.println("invalid number");
			break;
		}

	}

	public static void updateSong() {
		System.out.println("1.Name" + "\n" + "2. Singer" + "\n" + "3 exit");
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("updata name");
			break;

		case 2:
			System.out.println("update singer");
			break;
		case 3:
			System.out.println("exit");
			loop = false;
			break;
		default:
			System.out.println("invalid number");
			break;
		}

	}

	public static void exit() {

	}
}
