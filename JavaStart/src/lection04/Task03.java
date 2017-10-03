package lection04;

/*Напечатайте таблицу умножения на 5. 
 * Предпочтительно печататсь 1 х 5 =5, 2 х 5 = 10, 
 * а не просто 5, 10 и тд.*/

public class Task03 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.format("%d x 5 = %d", i, i * 5);
			System.out.println();
		}

	}

}
