package chapter1_Basics.cycles;

public class Task08 {

	public static void main(String[] args) {
		// ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � �������
		// �����.

		int M = 1230;
		int N = 1202;
		int m;
		int n;

		do { // ��������� �� ������� ��� ����� ������� � ������� �������
			m = M % 10;

			for (int c = N; c > 0; c = (int) (c / 10)) { //������ ���.���������� 'c', ���� �������� ��������� ����
				n = c % 10;

				if (n == m)
					System.out.println(m);

			}

			M = (int) (M / 10);

		} while (M > 0);
		
	}

}
