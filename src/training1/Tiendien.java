package training1;

import java.util.Scanner;

public class Tiendien {
	public static float soDien;
	public static float giaTien;
	public static final int price1 = 1000;
	public static final int price2 = 1250;
	public static final int price3 = 1800;
	public static final int price4 = 2500;

	public static float tinhTien(float soDien) {

		if (0 <= soDien && soDien < 25)
			giaTien = soDien * price1;
		if (25 <= soDien && soDien < 75)
			giaTien = soDien * price2;
		if (75 <= soDien && soDien < 150)
			giaTien = soDien * price3;
		if (150 <= soDien)
			giaTien = soDien * price4;
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
		giaTien = tinhTien(soDien);
		System.out.println("gia tien : " + giaTien);
		sc.close();
	}
}
