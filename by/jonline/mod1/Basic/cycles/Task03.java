package by.jonline.mod1.Basic.cycles;

public class Task03 {

	public static void main(String[] args) {
		// Найти сумму квадратов первых ста чисел.

		int n;
		int sumSq;

		sumSq = 0;
		n = 100;

		for (int i = 1; i <= n; i++) {
			sumSq += Math.pow(i, 2);
		}
		System.out.println(sumSq);

	}

}
