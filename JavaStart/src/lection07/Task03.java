package lection07;

import java.util.Scanner;

/*Ввести с консоли число в бинарном формате. 
 * Перевести его в десятичный и вывести на экран («10» -> 2)*/

public class Task03 {

	public static void main(String[] args) {
		String str = "10";
		System.out.println("Please enter binary:");
		str = new Scanner(System.in).next();

		System.out.println("Result is: " + getDec(str));

	}

	public static int getDec(String str) {
		int res = 0;
		int i = 0;
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		for (char ch : sb.toString().toCharArray()) {
			if (ch == '1') {
				res += Math.pow(2, i);
			}
			i++;
		}
		return res;
	}
}
