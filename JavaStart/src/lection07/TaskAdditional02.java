package lection07;

/*Расстояние Хемминга между двумя двоичными числами – это число позиций, 
 * в которых биты различаются. Для примера:
117 = 0 1 1 1 0 1 0 1
  17 = 0 0 0 1 0 0 0 1
Н = 0+1+1+0+0+1+0+0 = 3 расстояние Хэмминга между (117, 17)
Даны два положительных целых числа (N, M) в десятичном виде. 
Вам необходимо подсчитать расстояние Хэмминга между этими двумя числами.*/

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

		System.out.println("Hemming value is: " + counter);
	}
}
