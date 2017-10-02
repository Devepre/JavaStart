package lection03;

import java.util.Scanner;

/*��� ����������� ���������� ������ �(0, 0), �(4,4), �(6,1).
������������ ������ � ���������� ���������� ����� x � y.
��������� ��������� ������� ��������� ����� �� ���
����� ������ ������������ ��� ���*/

public class TaskAdditional02 {

	public static void main(String[] args) {
		float aX;
		float aY;
		float bX;
		float bY;
		float cX;
		float cY;
		float pX;
		float pY;				  
		aX = 0;
		aY = 0;
		bX = 4;
		bY = 4;
		cX = 6;
		cY = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Point coordinates pX, pY");
		pX = scanner.nextFloat();
		pY = scanner.nextFloat();		  
		  
		boolean result = false;
		float mu = (pX * bY - bX * pY) / (cX * bY - bX * cY);
		float lambda = (pX - mu * cX) / bX;
		if (mu >=0 && mu + lambda <= 1) {
			result = true;
		}		  
		System.out.println(result);
	}

}
