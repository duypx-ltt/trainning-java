package training1;

import java.util.Scanner;

public class Tiendien {
	public static float soDien;
	public static float giaTien;

	public static float giaTien(float soDien) {

		if (0 <= soDien && soDien < 25)
			giaTien = soDien * 1000;
		if (25 <= soDien && soDien < 75)
			giaTien = soDien * 1250;
		if (75 <= soDien && soDien < 150)
			giaTien = soDien * 180;
		if (150 <= soDien)
			giaTien = soDien * 2500;
		return giaTien;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so dien : ");
		soDien = sc.nextFloat();
		while (soDien < 0) {
			System.out.println("nhap lai : ");
			soDien = sc.nextFloat();
		}
		giaTien = giaTien(soDien);
		System.out.println("gia tien : " + giaTien);
	}
}
