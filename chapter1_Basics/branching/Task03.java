package chapter1_Basics.branching;

public class Task03 {

	public static void main(String[] args) {
		// ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������

		double x1 = 1;
		double y1 = 1;
		double x2 = 1;
		double y2 = 10;
		double x3 = 111;
		double y3 = 1;

		if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) // ��������� ������ �� ���������, ���� ����� ����� �����
																// ����� �� ����
			System.out.println("yes");
		else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
