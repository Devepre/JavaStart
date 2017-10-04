package lection04;

import java.util.Scanner;

/*Выведете на экран «песочные часы» максимальная 
 * ширина которых считывается с клавиатуры 
 * (число нечетное). В примере ширина равна 5
*****
 ***
  *
 ***
***** */

public class TaskAdditional03 {

	public static void main(String[] args) {
		int input;
		System.out.println("Please provide max width of sand clock:");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		boolean top;
		char drawCh;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				top = i <= (input / 2);
				drawCh = '*';
				if (top) {
					if ((j > (input - i + 1)) || j < i) {
						drawCh = ' ';
					}
				} else {
					if ((j < input - i + 1) || (j > i)) {
						drawCh = ' ';
					}
				}
				System.out.print(drawCh);
			}
			System.out.println();
		}

	}

}
