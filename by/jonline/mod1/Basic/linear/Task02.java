package by.jonline.mod1.Basic.linear;

public class Task02 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения): (b + √(b^2 +4ac)) / 2a -a^(3)c +b^(-2);

		double a = 2;
		double b = 3;
		double c = 5;
		double y;

		y = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);

		System.out.print("Expression value: " + y);
	}

}
