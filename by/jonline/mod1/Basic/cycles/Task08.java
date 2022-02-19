package by.jonline.mod1.Basic.cycles;

public class Task08 {

	public static void main(String[] args) {
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго
		// числа.

		int M = 1230;
		int N = 1202;
		int m;
		int n;

		do { // проверяем по очереди все цифры первого с цифрами второго
			m = M % 10;

			for (int c = N; c > 0; c = (int) (c / 10)) { // вводим доп.переменную 'c', чтоб сработал вложенный цикл
				n = c % 10;

				if (n == m)
					System.out.println(m);

			}

			M = (int) (M / 10);

		} while (M > 0);

	}

}
