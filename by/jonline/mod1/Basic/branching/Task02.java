package by.jonline.mod1.basic.branching;

public class Task02 {

	public static void main(String[] args) {
		// Найти max{min(a, b), min(c, d)}.
		
		int a = -5;
		int b = 5;
		int c = -9;
		int d = 9;
		
		int min1; // из a,b
		int min2; // из c,d
		int max;


		if (a >= b)
			min1 = b;
		else
			min1 = a;

		if (c >= d)
			min2 = d;
		else
			min2 = c;

		if (min1 >= min2)
			max = min1;
		else
			max = min2;

		System.out.println("min(a,b) = " + min1);
		System.out.println("min(c,d) = " + min2);
		System.out.println("max = " + max);

	}

}
