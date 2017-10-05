package lection05;

import java.util.Scanner;

/*Написать код для зеркального переворота массива 
 * (7,2,9,4) -> (4,9,2,7) – массив может быть произвольной 
 * длины. При выполнении задания использовать 
 * дополнительный массив нельзя (1 час)*/

public class TaskAdditional02 {

	public static void main(String[] args) {
		int size = 6;
		System.out.print("Please provide size of array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		System.out.println("Input arrays is:");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%2d", array[i]);
		}
		System.out.println();

		size--;
		for (int i = 0; i < array.length / 2; i++) {
			array[i] ^= array[size - i];
			array[size - i] ^= array[i];
			array[i] ^= array[size - i];
		}

		System.out.println("Inverted arrays is:");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%2d", array[i]);
		}
	}

}
