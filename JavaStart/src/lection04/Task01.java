package lection04;

import java.util.Scanner;

/*С помощью циклов нарисовать «обои». Причем количество 
 * полос должно вводиться с клавиатуры. В примере 7 полос.
 * ***+++***+++***+++***
 * ***+++***+++***+++*** */

public class Task01 {

	public static void main(String[] args) {
		int num;
		System.out.println("Please enter number of lines");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < num; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}

}
