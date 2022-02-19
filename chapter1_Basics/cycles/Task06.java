package chapter1_Basics.cycles;

public class Task06 {

	public static void main(String[] args) {
		// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

		int a = 33;
		char ch = 0;

		while (a <= 256) {
			ch = (char) a;
						
			System.out.printf("%03d - %c; ", a, ch); // выодим так, чтоб номер нулями подгонялся до трёхзначного
			
			if (a % 15 == 2) // выводим таблицу на 15 символов, смещаем на 2 символа, т.к. начали с 33
				System.out.println(" ");
			a += 1;
		}
	}

}
