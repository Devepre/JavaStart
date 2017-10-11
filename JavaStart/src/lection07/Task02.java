package lection07;

/*Написать свой вариант метода Arrays.toString() для int[].*/

public class Task02 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, -2, 0 };

		System.out.println(getString(arr));

	}

	public static String getString(int[] array) {
		StringBuilder sb = new StringBuilder("[");

		for (int el : array) {
			sb.append(el);
			sb.append(",");
		}
		sb.replace(sb.length() - 1, sb.length(), "]");

		return sb.toString();
	}
}
