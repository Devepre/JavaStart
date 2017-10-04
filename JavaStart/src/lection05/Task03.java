package lection05;

import java.util.Arrays;

/*Создать массив случайных чисел (размером 15 элементов). 
 * Создайте второй массив в два раза больше, первые 15 
 * элементов должны быть равны элементам первого массива, 
 * а остальные элементы заполнить удвоенным значением начальных. 
 * Например 
 * Было 1, 4, 2, 7 
 * Стало 1, 4, 7, 2, 2, 8, 4, 14*/

public class Task03 {

	public static void main(String[] args) {
		int[] inputArray = new int[15];
		for (int i = 0; i < 15; i++) {
			inputArray[i] = (int) (Math.random() * 20);
		}
		int[] outputArray = Arrays.copyOf(inputArray, inputArray.length * 2);
		int inputLength = inputArray.length;
		for (int i = 0; i < inputLength; i++) {
			outputArray[inputLength + i] = inputArray[i] * 2;
		}
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(outputArray));
	}
}
