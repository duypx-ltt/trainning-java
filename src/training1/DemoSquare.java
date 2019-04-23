package training1;

import java.util.Scanner;

public class DemoSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("edge = ");
		float x = sc.nextFloat();
		while (x <= 0) {
			System.out.println("insert edge > 0 : ");
			x = sc.nextFloat();
		}
		Square square = new Square();
		square.edge = x;
		square.printEdge();
		square.perimeter();
		square.area();
		square.printAll();
		sc.close();
	}
}
