package lection06;

/*Напишите метод который реализует линейный поиск элемента в 
 * массиве целых чисел. Если такой эелемент в массиве есть то 
 * верните его индекс, если не, то метод должен возвращать -1.*/

public class Task04 {

	public static void main(String[] args) {
		int[] array = new int[] { 34, 345, 3, 5, 7, 34, 64, 0 - 234, -5 };
		System.out.println(getElementIndex(-234, array));
	}

	public static int getElementIndex(int toFind, int... array) {
		int index = -1;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == toFind) {
				index = j;
				break;
			}
		}
		return index;
	}
}
