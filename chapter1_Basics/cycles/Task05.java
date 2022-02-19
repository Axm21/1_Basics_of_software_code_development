package chapter1_Basics.cycles;

public class Task05 {

	public static void main(String[] args) {
		// ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������
		// ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
		// a(n) = (1 / 2^n ) + (1 / 3^n)

		int n = 15;
		double a;
		double sum = 0;
		double e = 0.01;

		for (int i = 1; i < n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i); // ������� ������ ����
			if (Math.abs(a) >= e) // ���������� ��� �� ������
				sum += a;
			System.out.println("a(" + i + ") = " + a + ": sum = " + sum); // ������ ������ ��������, ���� ���� �����
																			// ���� (�������� ���� ����)
		}
	}

}
