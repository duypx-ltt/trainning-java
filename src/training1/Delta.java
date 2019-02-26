package training1;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		float a = sc.nextFloat();
		System.out.println("b = ");
		float b = sc.nextFloat();
		System.out.println("c = ");
		float c = sc.nextFloat();
		float delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("delta < 0");
			sc.close();
			return;
		}
		System.out.println("sqrt(delta) = " + Math.sqrt(delta));
		sc.close();

	}
}
