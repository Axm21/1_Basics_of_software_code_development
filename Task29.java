package by.jonline.lec04.cycles;

public class Task29 {

	public static void main(String[] args) {
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго
		// числа.

		int M = 1230;
		int N = 1202;
		int m, n;

		do {
			m = M % 10;

			for (int c = N; c > 0; c = (int) (c / 10)) {
				n = c % 10;

				if (n == m)
				System.out.println(m);

			}

			M = (int) (M / 10);

		} while (M > 0);

	}

}
