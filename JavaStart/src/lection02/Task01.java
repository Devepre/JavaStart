package lection02;

import java.util.Locale;
import java.util.Scanner;

/*Написать программу которая считывает 
 * 5и значно число с клавиатуры и выводит 
 * цифры из которого оно состоит. Например:
* 54698
* 5
* 4
* 6
* 9
* 8*/

public class Task01 {

	public static void main(String[] args) {
		System.out.println("Please enter number:");
		Scanner scanner = new Scanner(System.in);		
		scanner.useLocale(Locale.US); //. as separator
		Double inputDigit = scanner.nextDouble();	//for bug try 2.36 value for example  
				
		if (inputDigit.equals(-0d)) {
			System.out.println("-0");
		} else {
			if (inputDigit.equals(0d)) {
				System.out.println("0");
			} else {
				double digit = inputDigit;
				if (digit < 0) {
					System.out.println("-");
					digit = - digit;
				}
				int digitsCount = (int) Math.log10(digit);	
				int power;
				int digitToShow = 0;
				while (digitsCount >= 0) {
					power = (int) Math.pow(10, digitsCount);
					digitToShow = (int) (digit / power);
					digit %= power;
					digitsCount--;
					System.out.println(digitToShow);
				}					
				if (digit > 0) {
					System.out.println(".");					
				
					digit = inputDigit < 0 ? -inputDigit : inputDigit;	
					double check = 0;					
					double checkInput = inputDigit % 1;	//0.3599999999999999 instead of 0.36 here
					int i = 0;
					do {
						digit *= 10;	//23.599999999999998 instead of 23.6
						digitToShow = (int)digit % 10;
						System.out.println(digitToShow);											
						check +=  (double)digitToShow / (Math.pow(10, ++i)); 								
					} while (check < checkInput);   //so here we get infinitive loop
				}				
			}
		}	
	}

}
