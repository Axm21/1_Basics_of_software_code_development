package chapter1_Basics.cycles;

public class Task04 {

	public static void main(String[] args) {
		// ��������� ��������� ���������� ������������ ��������� ������ ������� �����.

		int a;
		int n;

		a = 1;
		n = 200;
		long multSq = 1;
		long c = Long.MAX_VALUE;

		while (a <= n) {
			if (a != 0 && multSq <= c / (a * a)) { // ������������ ����� ������ � �������, ����� ����.���� ��� �������
													// �� ������� ����� ��� ��������� ������ ��� ���� ������������
				multSq *= a * a;

			} else {
				System.out.println("������������ ���������� �� " + a + "-�� ��������");
				break; // ������������� ����, ����� ���������� �����������
			}
			System.out.println(multSq);
			a++;
		}

	}

}
