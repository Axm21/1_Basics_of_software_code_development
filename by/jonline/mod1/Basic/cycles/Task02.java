package by.jonline.mod1.Basic.cycles;

public class Task02 {

	public static void main(String[] args) {
		// Вычислить значения функции на отрезке [а,b] c шагом h: y = {(x, x>2) (-x,
		// x<=2)}

		double x;
		double y;

		double a = -9;
		double b = 10;
		double h = 0.5;

		x = a;

		while (x <= b) {
			if (x > 2)
				y = x;
			else
				y = -x;
			System.out.println("y(" + x + ") = " + y);
			x += h;
		}
	}

}
