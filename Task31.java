package by.jonline.lec04.cycles;

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		/*
		 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
		 * пытается их угадать. Программа должна выводить угаданные и неугаданные числа
		 * из тех, что сгенерировала программа, а также ошибочные числа пользователя.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("number 1 >> ");
		while (!sc.hasNext()) {
			sc.nextLine();
			System.out.print("number 1 >> ");
		}
		int num1 = sc.nextInt();

		System.out.print("number 2 >> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("number 2 >> ");
		}
		int num2 = sc.nextInt();

		System.out.print("number 3 >> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("number 3 >> ");
		}
		int num3 = sc.nextInt();

		System.out.print("number 4 >> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("number 4 >> ");
		}
		int num4 = sc.nextInt();

		System.out.print("number 5 >> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("number 5 >> ");
		}
		int num5 = sc.nextInt();

		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		boolean check5 = false;

		for (int i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 15 + 1);
			System.out.print(random + "; ");
			if (random == num1)
				check1 = true;

			if (random == num2)
				check2 = true;

			if (random == num3)
				check3 = true;

			if (random == num4)
				check4 = true;

			if (random == num5)
				check5 = true;
		}
		System.out.print("\nincorrect numbers: ");
		if (check1 == false)
			System.out.print(num1 +"; ");
		if (check2 == false)
			System.out.print(num2 +"; ");
		if (check3 == false)
			System.out.print(num3 +"; ");
		if (check4 == false)
			System.out.print(num4 +"; ");
		if (check5 == false)
			System.out.print(num5 +"; ");
	}

}
