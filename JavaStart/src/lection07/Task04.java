package lection07;

/*Выведите на экран 10 строк со значением числа Пи. 
 * Причем в первой строке должно быть 2 знака после запятой, 
 * во второй 3, в третьей 4 и тд.*/

public class Task04 {

	public static void main(String[] args) {
		showPi();
	}

	public static void showPi() {
		for (int i = 2; i < 12; i++) {
			System.out.format("%." + i + "f", Math.PI);
			System.out.println();
		}
	}
}
