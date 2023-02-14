package multiplayer;

import java.util.Scanner;

public class Multiplayer {

	static boolean loop = true;

	public static void main(String[] agrs) {
		menu();
		if (loop)
			
		{
			menu();
		}

	}

	public static void menu() {

		System.out.println(
				"MENU" + "\n" + "1.Play Song" + "\n" + "2.Add/Remove Song" + "\n" + "3.Update Song" + "\n" + "4.Exit");
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = s.nextInt();
		if (loop = true) {
			switch (choice) {
			case 1:
				SongOperation.playSong();
				break;
			case 2:
				SongOperation.addRemoveSong();
				break;
			case 3:
				SongOperation.updateSong();
				break;
			case 4:

				System.out.println("exit");
				loop = false;
				break;

			default:
				System.out.println("invalid number");
				break;
			}
		} else {
			System.out.println("enter currect data");
		}

	}
}
