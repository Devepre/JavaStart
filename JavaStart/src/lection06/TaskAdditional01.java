package lection06;

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
