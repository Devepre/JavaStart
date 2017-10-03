package lection04;

import java.util.Scanner;

/*С помощью цикла (только одного) нарисовать такую фигуру. 
 * Причем максимальная высота этой фигуры вводится с клавиатуры 
 * (в примере максимальна высота 4)
*
**
***
****
***
**
*
* */

public class TaskAdditional01 {

	public static void main(String[] args) {
		System.out.println("Please provide max width:");
		Scanner sc = new Scanner(System.in);
		int width;
		width = sc.nextInt();

		int checker = 1;
		int step = checker + 1;
		boolean up = true;
		for (int i = 1; i <= width * width; i++) {
			System.out.print("*");
			if (i == checker) {
				System.out.println();
				checker = checker + step;
				if (step == width) {
					up = false;
				}
				step = up ? ++step : --step;
			}
		}

	}

}
