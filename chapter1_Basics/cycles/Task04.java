package chapter1_Basics.cycles;

public class Task04 {

	public static void main(String[] args) {
		// Составить программу нахождения произведения квадратов первых двухсот чисел.

		int a;
		int n;

		a = 1;
		n = 200;
		long multSq = 1;
		long c = Long.MAX_VALUE;

		while (a <= n) {
			if (a != 0 && multSq <= c / (a * a)) { // переполнение будем ловить в моменте, когда макс.лонг при делении
													// на квадрат числа даёт результат меньше чем наше произведение
				multSq *= a * a;

			} else {
				System.out.println("переполнение переменной на " + a + "-ой итерации");
				break; // останавливаем цикл, когда переменная переполнена
			}
			System.out.println(multSq);
			a++;
		}

	}

}
