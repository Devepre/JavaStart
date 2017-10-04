package lection04;

import java.util.Scanner;

/*Вычислить с помощью цикла факториал числа n введенного с 
 * клавиатуры (4<n<16). Факториал числа это произведение всех 
 * чисел от этого числа до 1. Например 5!=5*4*3*2*1=120*/

public class Task02 {

	public static void main(String[] args) {
		int n;
		long result = 1L;
		System.out.println("Please enter n for factorial:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		int i = n;
		for (; i > 1; i--) {
			result *= i;
		}
		System.out.println(result);

	}

}
