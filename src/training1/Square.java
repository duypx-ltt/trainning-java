package training1;

import java.util.Scanner;

public class Square {
	public float edge;

	public void printEdge() {
		System.out.println("edge = " + edge);
	}

	public void perimeter() {
		System.out.println("perimeter = " + (edge * 4));
	}

	public void area() {
		System.out.println("area = " + (edge * edge));
	}

	public void printAll() {
		System.out.println("edge = " + edge);
		System.out.println("perimeter = " + (edge * 4));
		System.out.println("area = " + (edge * edge));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("edge = ");
		float x = sc.nextFloat();
		Square square = new Square();
		square.edge = x;
		square.printEdge();
		square.perimeter();
		square.area();
		square.printAll();
	}
}
