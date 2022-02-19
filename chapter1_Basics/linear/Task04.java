package chapter1_Basics.linear;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
		// целой частях). Поменять местами дробную и целую части числа и вывести
		// полученное значение числа.

		double R;
		int n;
		int d;

		R = EnterFromConsole("Введите число формата: 'nnn,ddd' >> ");

		while (R > 999) { // проверяем: если >=1000, вводим новое число
			System.out.println("Целая часть числа не может состоять больше, чем из трёх знаков!");
			R = EnterFromConsole("Введите число формата: 'nnn,ddd' >> ");
		}

		n = (int) R; // отбрасываем хвост
		d = (int) (R * 1000 - n * 1000); // отбрасываем целую часть
		R = d + n / 1000.0;

		System.out.printf("%07.3f", R); //форматируем длину в 7 симфолов и 3 символа после запятой

	}

	public static double EnterFromConsole(String message) {
		double value;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print(message);
		while (!input.hasNextDouble()) {
			input.next();
			System.out.print(message);
		}
		value = input.nextDouble();

		return value;

	}

}
