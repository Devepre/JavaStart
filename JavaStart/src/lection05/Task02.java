package lection05;

import java.util.Arrays;
import java.util.Scanner;

/*Написать код для возможности создания массива 
 * целых чисел (размер вводится с клавиатуры) и 
 * возможности заполнения каждого его элемента вручную. 
 * Выведите этот массив на экран.*/

public class Task02 {

	public static void main(String[] args) {
		System.out.print("Please provide size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.format("Please provide %d element of array: ", i + 1);
			array[i] = sc.nextInt();
		}
		System.out.println("Great work! Your array is:");
		System.out.println(Arrays.toString(array));
	}

}
