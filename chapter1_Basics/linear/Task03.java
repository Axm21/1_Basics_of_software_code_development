package chapter1_Basics.linear;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения): ((sin x + cos y) / (cos x - sin y)) * tg xy

		double x;
		double y;
		double ch;
		double zn;
		double itog;

		x = EnterFromConsole("x >> ");
		y = EnterFromConsole("y >> ");

		ch = Math.sin(x) + Math.cos(y); // проводим вычисления для простоты чтения отдельно
		zn = Math.cos(x) - Math.sin(y);
		itog = ch / zn * Math.tan(x * y);

		System.out.println("Answer: " + itog);
	}

	public static double EnterFromConsole(String message) {

		double value;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print(message);
		while (!input.hasNextDouble()) { //
			input.next();
			System.out.print(message);
		}
		value = input.nextDouble();
		
		return value;
	}

}
