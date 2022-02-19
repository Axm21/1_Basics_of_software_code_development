package chapter1_Basics.branching;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие.

		double A = 8;
		double B = 13;
		double x;
		double y;
		double z;

		x = EnterFromConsole("x >> ");
		while (x <= 0) {
			System.out.println("x must be greater than 0");
			x = EnterFromConsole("x >> ");
		}

		y = EnterFromConsole("y >> ");
		while (y <= 0) {
			System.out.println("y must be greater than 0");
			y = EnterFromConsole("y >> ");
		}

		z = EnterFromConsole("z >> ");
		while (z <= 0) {
			System.out.println("z must be greater than 0");
			z = EnterFromConsole("z >> ");
		}

		if ((A > x && B > y) || (A > x && B > z) || (A > y && B > x) || (A > y && B > z) || (A > z && B > x)
				|| (A > z && B > y)) { // проверяем, чтоб прошли самые короткие 2 стороны
			System.out.println("yes");
		} else
			System.out.println("no");

	}

	public static double EnterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}
		double value = sc.nextDouble();

		return value;
	}

}
