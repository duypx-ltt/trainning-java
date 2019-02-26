package training4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<New> list = new ArrayList<New>();
		New tmp = new New();
		int menu;
		do {
			System.out.println("----------------------");
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.println("your choice : ");
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				try {
					tmp = New.input();
					list.add(tmp);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Number Format Exception");
				}
			case 2:
				New.displayAll(list);
				break;
			case 3:
				New.displayAll(list);
				break;
			case 4:
				sc.close();
				break;
			}
		} while (menu != 4);
	}

}
