package by.jonline.mod1.Basic.cycles;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Напишите программу, где пользователь вводит любое целое положительное число.
		// А программа суммирует все числа от 1 до введенного пользователем числа

		int n;
		int sum = 0;
		int i = 1;

		n = EnterFromConsole("number>> ");
		while (n <= 0) {
			System.out.println("number must be greater than 0");
			n = EnterFromConsole("number>> ");
		}

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);

	}

	public static int EnterFromConsole(String message) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}

}
