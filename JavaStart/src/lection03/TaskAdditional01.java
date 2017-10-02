package lection03;

import java.util.Scanner;

/*���� ���� � ������� � ������ ��������� � �������� 4.
������������ ������ � ���������� ���������� ����� x � y.
�������� ���������, ������� �������� ����� �� 
��� ����� ������ ����� ��� ���*/

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
