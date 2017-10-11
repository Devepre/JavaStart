package lection06;

/*Существуют такие последовательности чисел:
0,2,4,6,8,10,12
1,4,7,10,13
1,2,4,8,16,32
1,3,9,27
1,4,9,16,25
1,8,27,64,125
Реализуйте программу которая выведет следующий член 
этой последовательности (либо подобной им). 
Например пользователь вводит строку 0,2,4,6,8,10,12 
ответом программы должно быть число 14 (6 часов)*/

import java.util.Scanner;

public class TaskAdditional01 {

	public static void main(String[] args) {
		System.out.println("Please provide at least 3 numbers separated by comma , ");
		int[] array = getArray();
		long res = getNext(array);
		
		if (res == -1) {
			System.out.println("Wrong input.");
		} else {
			System.out.println(res);
		}

	}

	static int checkArray(int... array) {
		int result = -1;

		if (array[1] - array[0] == array[2] - array[1]) {
			int difference = array[1] - array[0];
			result = 0;
			for (int i = 2; i < array.length; i++) {
				if (array[i] - array[i - 1] != difference) {
					result = -1;
				}
			}
		} else if ((double) array[1] / array[0] == (double) array[2] / array[1]) {
			double difference = (double) array[1] / array[0];
			result = 1;
			for (int i = 2; i < array.length; i++) {
				if (((double) array[i] / array[i - 1]) != difference) {
					result = -1;
				}
			}
		} else {
			int i = 1;
			double p;
			do {
				i++;
				p = Math.pow(array[1], 1.0 / i);
			} while ((Math.pow(2, i) < array[1]));
			if (p - (int) p > 0) {
				result = -1;
			} else {
				result = i;
				for (int k = 2; k < array.length; k++) {
					if (array[k] != (int) Math.pow(k + 1, i)) {
						result = -1;
					}
				}
			}
		}

		return result;
	}

	public static long getNext(int... array) {
		long result = 0L;
		
		int decision = checkArray(array);
		switch (decision) {
		case -1:
			result = -1;
			break;
		case 0:
			result = array[array.length - 1] - array[array.length - 2] + array[array.length - 1];
			break;
		case 1:
			result = array[array.length - 1] * (array[1] / array[0]);
			break;
		default:
			result = (int) Math.pow(array.length + 1, decision);
			break;
		}

		return result;
	}

	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		String strInput = sc.nextLine();
		String[] str = strInput.split(",");
		int[] result = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			result[i] = Integer.parseInt(str[i]);
		}

		return result;
	}
}
