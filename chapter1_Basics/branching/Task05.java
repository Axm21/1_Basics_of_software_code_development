package chapter1_Basics.branching;

public class Task05 {

	public static void main(String[] args) {
		// Вычислить значения функции на отрезке [а,b] c шагом h: F(x) = {(x^2 - 3x + 9,
		// если x <=3); (1/ (x^3 + 6), если x > 3)}

		double F;
		double x = 4;

		if (x > 3)
			F = (1 / (x * x * x + 6));
		else
			F = (x * x - 3 * x + 9);
		System.out.print("F (" + x + ") = " + F);

	}

}
