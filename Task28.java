package by.jonline.lec04.cycles;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * Написать программу, в которой вводятся два операнда X и Y и знак операции
		 * (+,-,/,*).Вычислить результат Z в зависимости от знака. Предусмотреть реакции
		 * на возможный неверный знак операции, а также на ввод Y=0 при делении.
		 * Организовать возможность многократных вычислений без перезагрузки программы
		 * (т.е. построить цикл). В качестве символа прекращения вычислений принять '0'.
		 */

		double X, Y, Z = 0;
		String sign; // знак операции
		String button;
		boolean check = false;

		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("X>> ");// ввод первого числа
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("X>> ");
			}
			X = sc.nextDouble();

			System.out.print("Y>> ");// ввод второго числа
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Y>>");
			}
			Y = sc.nextDouble();
			sc.nextLine();

			System.out.print("Operation sign (+, -, /, *) >> ");

			sign = sc.nextLine();// ввод знака

			switch (sign) {
			case "*":
				Z = X * Y;
				break;
			case "/":
				if (Y != 0)
					Z = X / Y;
				break;
			case "+":
				Z = X + Y;
				break;
			case "-":
				Z = X - Y;
				break;
			default: {
				System.out.println("Operation sign mistake");
				check = true;//чтоб не печатало "Z="
			}

			}

			if (sign.equals("/") && Y == 0)// случай деления на ноль
				System.out.println("You can't divide on 0");
			else if (check != true)
				System.out.println("Z(" + X +sign + Y +")= " + Z);
			System.out.println("If you want stop tap '0', for continue - another button");// для продолжения цикла
			button = sc.nextLine();
		} while (!button.equals("0"));

	}

}
