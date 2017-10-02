package lection03;

import java.util.Scanner;

/*���������� ���������� ���� � ����, ������� ������ ������������. �
���������� ���� - 366 ����, ����� ��� � ������� 365. ����������� ������
�������� ��� ���� ��������� ������ �� 4 �� ����������� ��������, ������
�� ������� ������ �� 400*/

public class Task03 {

	public static void main(String[] args) {
		System.out.print("Please enter year: ");
		int yearInput = (new Scanner(System.in)).nextInt();
		int isLeap = 365;
		if (yearInput % 4 == 0) {
			isLeap = 366;
			if (yearInput % 100 == 0) {			
				isLeap = yearInput % 400 == 0 ? 366 : 365; 
			}			
		}		
		System.out.println("Total days for this year is: " + isLeap);
	}

}
