package lection03;

/*�������� ���������, ������� ������� 4 �����
� ���������� � ������� �� ����� ����� ������� �� ���.*/

import java.util.Locale;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int count = 4;
		System.out.format("Please enter %d digits to find max value: ", count);
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float maxDigit = scanner.nextFloat();
		float current;
		for (int i = 1; i < count; i++) {
			current = scanner.nextFloat();
			if (maxDigit < current) {
				maxDigit = current;
			}
		}		
		System.out.print("Max value is: " + maxDigit);
	}

}
