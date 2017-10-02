package lection03;

import java.util.Locale;
import java.util.Scanner;

/*Треугольник существует только тогда, когда сумма 
любых двух его сторон больше третьей. Дано: a, b, c - 
стороны предполагаемого треугольника. Напишите 
программу которая укажет существует ли такой треугольник или нет*/

public class Task04 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		
		if (args.length == 0) {
			System.out.println("Please enter a, b, c describing triangle:");
			Scanner scanner = new Scanner(System.in);
			scanner.useLocale(Locale.US);
			a = scanner.nextFloat();
			b = scanner.nextFloat();
			c = scanner.nextFloat();
			
		} else {
			a = Float.parseFloat(args[0]);
			b = Float.parseFloat(args[1]);
			c = Float.parseFloat(args[2]);
		}
		
		if (a + b <= c || a + c <= b || b + c < a) {
			System.out.println("It's not a triangle!");						
		} else {
			System.out.println("Perfect!");
		}	
	}

}
