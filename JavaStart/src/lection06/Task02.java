package lection06;

/*Реализуйте метод параметрами которого являются – 
 * целое число, вещественное число и строка. Возвращает 
 * он конкатенацию строки с суммой вещественного и целого числа.*/

public class Task02 {

	public static void main(String[] args) {
		int a = 923;
		double b = 3.24252;
		String str = "Magic digits are ";

		System.out.println(getConcat(a, b, str));

	}

	public static String getConcat(int number, double floatNumber, String text) {
		String result = text;
		double sum = floatNumber + number;
		result += sum;
		return result;
	}
}
