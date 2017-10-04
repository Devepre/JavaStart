package lection05;

/*Дан массив {0, 5, 2, 4, 7, 1, 3, 19} – написать 
 * программу для подсчета нечетных цифр в нем.*/

public class Task01 {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int oddCounter = 0;
		for (int value : inputArray) {
			if (value % 2 != 0) {
				oddCounter++;
			}
		}
		System.out.println("Count of odd numbers is " + oddCounter);
	}
}
