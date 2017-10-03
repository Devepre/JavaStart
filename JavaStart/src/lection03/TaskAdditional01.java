package lection03;

import java.util.Scanner;

/*Есть круг с центром в начале координат и радиусом 4. 
 * Пользователь вводит с клавиатуры координаты точки x и y. 
 * Написать программу, которая определи лежит ли  эта точка внутри круга или нет.*/

public class TaskAdditional01 {

	public static void main(String[] args) {
		int circleRadius = 4;
		System.out.println("Please enter point (x, y) coordinates");
		Scanner scanner = new Scanner(System.in);		
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		double length = Math.sqrt( x * x + y * y);
		if (circleRadius >= length) {				
			System.out.println("This point belongs to circle");
		} else {
			System.out.println("This point doesn't belongs to circle");
		}
	}

}
