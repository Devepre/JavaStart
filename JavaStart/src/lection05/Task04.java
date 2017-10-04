package lection05;

import java.util.Scanner;

/*Введите строку текста с клавиатуры – реализуйте 
 * программу для возможности подсчета количества 
 * символа «b» в этой строке, с выводом результата 
 * на экран.*/

public class Task04 {

	public static void main(String[] args) {
		System.out.print("Please provide any text: ");
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		sc.close();
		int counter = 0;
		for (char ch : inputText.toCharArray()) {
			if (ch == 'b') {
				counter++;
			}
		}
		System.out.println("There was " + counter + " letter \"b\" found");
	}
}
