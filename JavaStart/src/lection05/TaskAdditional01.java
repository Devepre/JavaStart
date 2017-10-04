package lection05;

import java.util.Arrays;
import java.util.Scanner;

/*Перевернуть массив». Т.е. написать программу кторая 
 * повернет базовый массив на 90, 180, 270 градусов 
 * по часовой стрелке (при выполнении задания использовать 
 * дополнительный массив нельзя). В примере показан 
 * поворот на 90 градусов (3 часа)
Было:
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6

Стало:
1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3 3
4 4 4 4 4 4
5 5 5 5 5 5
6 6 6 6 6 6*/

public class TaskAdditional01 {

	public static void main(String[] args) {
		System.out.print("Please provide size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] array = new int[size][size];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}

		size--;
		for (int k = 0; k < 4; k++) {
			switch (k) {
			case 0:
				System.out.println("Input array:");
				break;
			case 1:
				System.out.println("90 degrees clockwised array:");
				break;
			case 2:
				System.out.println("180 degrees clockwised array:");
				break;
			case 3:
				System.out.println("270 degrees clockwised array:");
				break;
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.format("%3d", array[i][j]);
				}
				System.out.println();
			}
			System.out.println();

			if (k < 3) {
				for (int i = 0; i <= size / 2; i++) {
					for (int j = i; j < size - i; j++) {
						int tmp = array[i][j];
						array[i][j] = array[size - j][i];
						array[size - j][i] = array[size - i][size - j];
						array[size - i][size - j] = array[j][size - i];
						array[j][size - i] = tmp;
					}
				}
			}
		}

	}

}
