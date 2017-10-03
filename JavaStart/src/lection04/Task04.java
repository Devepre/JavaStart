package lection04;

import java.util.Scanner;

/*Выведете на экран прямоугольник из *. Причем высота и 
 * ширина прямоугольника вводятся с клавиатуры. Например ниже 
 * представен прямоугольник  с высотой 4 и шириной 5
 * *****
   *   *
   *   *
   ***** */

public class Task04 {

	public static void main(String[] args) {
		System.out.println("Please provide width and height:");
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		width = sc.nextInt();
		height = sc.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
