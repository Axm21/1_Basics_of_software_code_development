package chapter1_Basics.linear;

public class Task06 {

	public static void main(String[] args) {
		// Для данной области составить линейную программу, которая печатает true, если
		// точка с координатами (х, у) принадлежит закрашенной области, и false — в
		// противном случае:

		int x = 0;
		int y = 0;

		if (y > 4 || y < -3) { 	// проверяем, чтоб у попал в область значений
			System.out.println("false");
		} else if (y > 0) {
			if (x >= -2 && x <= 2) { // проверяем значения х при положительном у
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else if (x >= -4 && x <= 4) { // проверяем значения х при отрицательном у
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
