package by.jonline.mod1.Basic.linear;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах. Вывести данное значение длительности в часах, минутах и
		// секундах в следующей форме: ННч ММмин SSc.

		int T;
		int H;
		int M;
		int S;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Введите длительность времени в секундах >> ");
		while (!input.hasNextInt()) {
			input.next();
			System.out.print("Введите длительность времени в секундах >> ");
		}
		T = input.nextInt();

		S = T % 60;
		M = T / 60 % 60;
		H = T / 3600;

		System.out.printf("%1$02d ч %2$02d мин %3$02d с", H, M, S); // задаем минимальную длину в 2 символа
	}

}
