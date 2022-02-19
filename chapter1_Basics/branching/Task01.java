package chapter1_Basics.branching;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Äàíû äâà óãëà òðåóãîëüíèêà (â ãðàäóñàõ). Îïðåäåëèòü, ñóùåñòâóåò ëè òàêîé
		// òðåóãîëüíèê, è åñëè äà, òî áóäåò ëè îí ïðÿìîóãîëüíûì

		int angle1;
		int angle2;
		int angle3;

		angle1 = EnterFromConsole("angle1 >> ");
		while (angle1 <= 0) { // íå äà¸ì ââîäèòü îòðèöàòåëüíûå óãëû
			System.out.println("angle must been greater than 0");
			angle1 = EnterFromConsole("angle1 >> ");
		}

		angle2 = EnterFromConsole("angle1 >> ");
		while (angle2 <= -1) {
			System.out.println("angle must been greater than 0");
			angle2 = EnterFromConsole("angle1 >> ");
		}

		if (angle1 + angle2 < 180) { // ñóììà 3 óãëîâ â òðåóãîëüíèêå = 180
			System.out.println("The triangle exists.");
			angle3 = 180 - angle1 - angle2;

			if (angle1 == 90 || angle2 == 90 || angle3 == 90) { // ïðîâåðÿåì êàæäûé óãîë, íå ïðÿìîé ëè îí
				System.out.println("This is right triangle.");
			} else
				System.out.println("This isn't right triangle.");
		} else
			System.out.println("The triangle doesn't exist.");

	}

	public static int EnterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		int value = sc.nextInt();

		return value;
	}

}
