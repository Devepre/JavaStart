package lection02;

import java.util.Locale;
import java.util.Scanner;

/*Написать программу, которая вычислит и выведет
на экран длину окружности, если ее радиус считывается с клавиатуры.*/

public class Task03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		System.out.println("Please enter radius:");
		float radius = scanner.nextFloat();
		
		double circleLength = 2* radius * Math.PI;
		
		System.out.format("Square is: %f", circleLength);
	}

}
