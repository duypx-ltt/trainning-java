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

	public static ArrayList<Integer> rateList = new ArrayList<Integer>();

	public void calculate(ArrayList<Integer> arr) {
		int size = arr.size();
		int S = 0;
		for (int x : arr) {
			S = S + x;
		}
		this.averageRate = S / size;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static New input() {
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
		int x = Integer.parseInt(sc.nextLine());
		New.rateList.add(x);
		System.out.println("rate 2 : ");
		x = Integer.parseInt(sc.nextLine());
		New.rateList.add(x);
		System.out.println("rate 3 : ");
		x = Integer.parseInt(sc.nextLine());
		New.rateList.add(x);
		oj1.calculate(rateList);
		return oj1;

	}

	public static void displayAll(ArrayList<New> arr) {
		for (New object : arr) {
			object.display();
		}
	}

}
