package by.jonline.mod1.Basic.cycles;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// Для каждого натурального числа в промежутке от m до n вывести все делители,
		// кроме единицы и самого числа. m и n вводятся с клавиатуры.

		int m;
		int n;
		int div;

		m = EntFrCons("m >> ");
		while (m < 1) {
			m = EntFrCons("m >> ");
		}

		n = EntFrCons("n >> ");
		while (n < 1) {
			n = EntFrCons("n >> ");
		}

		while (m <= n) {
			System.out.print("dividers for " + m + ": ");
			div = 2; // начинаем с 2, чтоб исключить 1
			boolean check = false; // с её помощью будем определять, были ли делитель у числа
			while (div < m) {
				if (m % div == 0) {
					System.out.print(div + "; ");
					check = true;
				}
				div += 1;
			}
			if (check == false)
				System.out.print(" - ");
			System.out.println(" ");
			m += 1;
		}

	}

	public static int EntFrCons(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;

	}

}
