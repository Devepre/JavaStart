package lection07;

import java.util.Scanner;

public class TaskAdditional02 {

	public static void main(String[] args) {
		int a = 118;
		int b = 17;
		System.out.println("Please enter a and b for Hemming:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		int c = a ^ b;

		int counter = 0;
		for (; c > 0; c = c >> 1) {
			if ((c & 1) == 1) {
				counter++;
			}
		}

		System.out.println("Hemming vale is: " + counter);
	}
}
