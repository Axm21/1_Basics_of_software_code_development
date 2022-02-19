package chapter1_Basics.cycles;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,
		// ����� ������� � ������ �����. m � n �������� � ����������.
		
		int m;
		int n;
		int div;

		m = EntFrCons("m >> ");
		while (m < 1) {
			m = EntFrCons("m >> ");
		}
		
		n = EntFrCons("n >> ");
		while (n < 1) {
			n = EntFrCons("n >> ");
		}

		while (m <= n) {
			System.out.print("dividers for " + m + ": ");
			div = 2; // �������� � 2, ���� ��������� 1
			boolean check = false; // � � ������� ����� ����������, ���� �� �������� � �����
			while (div < m) {
				if (m % div == 0) {
					System.out.print(div + "; ");
					check = true;
				}
				div += 1;
			}
			if (check == false)
				System.out.print(" - ");
			System.out.println(" ");
			m += 1;
		}

	}

	public static int EntFrCons(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;

	}

}
