package lection03;

import java.util.Scanner;

/*С клавиатуры вводится шестизначное число. Проверить, 
 * является ли оно палиндромом. Примечание: палиндромом 
 * называется число, слово, или текст, которые одинаково 
 * читаются слева направо и справа налево. Например, 
 * это числа 143341, 5555, 7117 и тд.*/

public class TaskAdditional04 {

	public static void main(String[] args) {
		System.out.println("Please enter 6-digits number:");
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		sc.close();
		if (number < 100000 || number > 999999) {
			System.out.println("Wrong number!");
			System.exit(0);
		}

		int digitL;
		int digitR;
		boolean isPalindrom = false;

		digitL = number / 100000;
		digitR = number % 10;

		if (digitL == digitR) {
			digitL = (number / 10000) % 10;
			digitR = (number / 10) % 10;
		}
		if (digitL == digitR) {
			digitL = (number / 1000) % 10;
			digitR = (number / 100) % 10;			
		}
		if (digitL == digitR) {
			isPalindrom = true;
		}

		if (isPalindrom) {
			System.out.println("It's palindrom");
		} else {
			System.out.println("Itisn't palindrom");
		}
	}

}
