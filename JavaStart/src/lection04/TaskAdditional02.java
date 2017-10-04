package lection04;

/*С помощью циклов вывести на экран все простые числа 
 * от 1 до 100. Простое число – число которое делится 
 * нацело только на единицу или само на себя. Первые 
 * простые числа это 2,3,5,7…*/

public class TaskAdditional02 {

	public static void main(String[] args) {
		boolean isSimple;
		for (int i = 2; i < 101; i++) {
			isSimple = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isSimple = false;
					break;
				}				
			}
			if (isSimple) {
				System.out.print(i + " ");
			}			
		}

	}

}
