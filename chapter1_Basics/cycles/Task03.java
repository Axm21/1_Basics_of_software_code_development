package chapter1_Basics.cycles;

public class Task03 {

	public static void main(String[] args) {
		// ����� ����� ��������� ������ ��� �����.

		int n;
		int sumSq;

		sumSq = 0;
		n = 100;

		for (int i = 1; i <= n; i++) {
			sumSq += Math.pow(i, 2);
		}
		System.out.println(sumSq);

	}

}
