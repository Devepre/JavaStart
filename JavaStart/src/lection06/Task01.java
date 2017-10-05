package lection06;

import java.util.Scanner;

/*Напишите метод который вернет максимальное 
 * число из массива целых чисел*/

public class Task01 {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 8, 34, 2, 234, 3 };
		System.out.println("Mas element is " + getMax(array));

	}

	public static int getMax(int... array) {
		int max = array[0];
		for (int element : array) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}
}
