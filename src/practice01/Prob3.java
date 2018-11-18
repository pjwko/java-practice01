package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요:");
			int number = scanner.nextInt();
			int sumh = 0;
			
			if (number % 2 == 1) {
				for (int hol = 1; hol <= number; hol += 2) {
					sumh = sumh + hol;
				}
				
			} else {
				for (int hol = 0; hol <= number; hol += 2) {
					sumh += hol;
				}
			}
			System.out.println(sumh);
		}
	}
}
