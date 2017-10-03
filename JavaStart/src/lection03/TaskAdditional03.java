package lection03;

import java.util.Scanner;

/*Проверить является ли число
 * счастливім билетом*/

public class TaskAdditional03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Please enter 4-digits number");
		number = sc.nextInt();
		sc.close();
		
		if (number < 1000 || number > 9999) {
			System.out.println("Wrong number!");
			System.exit(0);
		}
		int left1;
		int left2;
		int right1;
		int right2;
		int sumL = 0;
		int sumR = 0;

		left1 = number / 1000;
		left2 = (number / 100) % 10;
		right1 = (number / 10) % 10;
		right2 = number % 10;

		sumL = left1 + left2;
		sumR = right1 + right2;

		if (sumL > 9) {
			left1 = sumL / 10;
			left2 = sumL % 10;
			sumL = left1 + left2;
		}

		if (sumR > 9) {
			right1 = sumR / 10;
			right2 = sumR % 10;
			sumR = right1 + right2;
		}

		boolean isLucky;
		isLucky = sumL == sumR;
		System.out.println("This ticket is lucky: " + isLucky);
	}
	
}
