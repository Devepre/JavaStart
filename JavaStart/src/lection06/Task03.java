package lection06;

/*Реализуйте метод рисующий на экране прямоугольник из звездочек *. 
 * Его параметрами будут целые числа которые описывают длину 
 * и ширину такого прямоугольника.*/

public class Task03 {

	public static void main(String[] args) {
		drawRectangle(4, 5);

	}

	public static void drawRectangle(int width, int height) {
		for(int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
