package chapter1_Basics.cycles;

public class Task06 {

	public static void main(String[] args) {
		// ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� � ������ ����������.

		int a = 33;
		char ch = 0;

		while (a <= 256) {
			ch = (char) a;
						
			System.out.printf("%03d - %c; ", a, ch); // ������ ���, ���� ����� ������ ���������� �� �����������
			
			if (a % 15 == 2) // ������� ������� �� 15 ��������, ������� �� 2 �������, �.�. ������ � 33
				System.out.println(" ");
			a += 1;
		}
	}

}
