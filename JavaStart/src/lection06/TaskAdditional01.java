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
		
		System.out.println(res);

	}

	public static long getNext(int... array) {
		long result = 0L;

		if (array[1] - array[0] == array[2] - array[1]) {
			result = array[array.length - 1] - array[array.length - 2] + array[array.length - 1];
		} else if (array[1] / array[0] == array[2] / array[1]) {
			result = array[array.length - 1] * (array[1] / array[0]);
		} else {
			int i = 1;
			double p;
			do {
				i++;
				p = Math.pow(array[1], 1.0 / i);
			} while ((Math.pow(2, i) < array[1]));
			result = (int) Math.pow(array.length + 1, i);
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
