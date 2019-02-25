package training4;

import java.util.ArrayList;
import java.util.Scanner;

public class New implements INew {
	private int id;
	private String title;
	private String author;
	private String content;
	private float averageRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void display() {
		System.out.println("id :" + this.getId());
		System.out.println("title :" + this.getTitle());
		System.out.println("author :" + this.getAuthor());
		System.out.println("content :" + this.getContent());
		System.out.println("average rate :" + this.getAverageRate());
		System.out.println("");

	}

	public static int[] rateList = new int[3];

	public void calculate(int[] arr) {
		float x = ((arr[0] + arr[1] + arr[2]) / 3);
		this.averageRate = x;
	}

	public static New input() {
		Scanner sc = new Scanner(System.in);
		New oj1 = new New();
		System.out.println("id : ");
		oj1.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("title : ");
		oj1.setTitle(sc.nextLine());
		System.out.println("author : ");
		oj1.setAuthor(sc.nextLine());
		System.out.println("content : ");
		oj1.setContent(sc.nextLine());
		System.out.println("rate 1 : ");
		oj1.rateList[0] = Integer.parseInt(sc.nextLine());
		System.out.println("rate 2 : ");
		oj1.rateList[1] = Integer.parseInt(sc.nextLine());
		System.out.println("rate 3 : ");
		oj1.rateList[2] = Integer.parseInt(sc.nextLine());
		oj1.calculate(rateList);
		return oj1;

	}

	public static void displayAll(ArrayList<New> arr) {
		for (New object : arr) {
			object.display();
		}
	}

	public static void main(String[] args) {
		ArrayList<New> list = new ArrayList<New>();
		Scanner sc = new Scanner(System.in);
		New tmp = new New();
		int menu;
		do {
			System.out.println("----------------------");
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.println("your choice : ");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				tmp = input();
				list.add(tmp);
				break;
			case 2:
				displayAll(list);
				break;
			case 3:
				displayAll(list);
				break;
			case 4:
				break;
			}
		} while (menu != 4);
	}

}
