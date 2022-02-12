package by.jonline.lec04.cycles;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * �������� ���������, � ������� �������� ��� �������� X � Y � ���� ��������
		 * (+,-,/,*).��������� ��������� Z � ����������� �� �����. ������������� �������
		 * �� ��������� �������� ���� ��������, � ����� �� ���� Y=0 ��� �������.
		 * ������������ ����������� ������������ ���������� ��� ������������ ���������
		 * (�.�. ��������� ����). � �������� ������� ����������� ���������� ������� '0'.
		 */

		double X, Y, Z = 0;
		String sign; // ���� ��������
		String button;
		boolean check = false;

		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("X>> ");// ���� ������� �����
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("X>> ");
			}
			X = sc.nextDouble();

			System.out.print("Y>> ");// ���� ������� �����
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Y>>");
			}
			Y = sc.nextDouble();
			sc.nextLine();

			System.out.print("Operation sign (+, -, /, *) >> ");

			sign = sc.nextLine();// ���� �����

			switch (sign) {
			case "*":
				Z = X * Y;
				break;
			case "/":
				if (Y != 0)
					Z = X / Y;
				break;
			case "+":
				Z = X + Y;
				break;
			case "-":
				Z = X - Y;
				break;
			default: {
				System.out.println("Operation sign mistake");
				check = true;//���� �� �������� "Z="
			}

			}

			if (sign.equals("/") && Y == 0)// ������ ������� �� ����
				System.out.println("You can't divide on 0");
			else if (check != true)
				System.out.println("Z(" + X +sign + Y +")= " + Z);
			System.out.println("If you want stop tap '0', for continue - another button");// ��� ����������� �����
			button = sc.nextLine();
		} while (!button.equals("0"));

	}

}
