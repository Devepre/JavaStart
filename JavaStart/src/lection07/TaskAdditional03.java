package lection07;

import java.util.Scanner;

public class TaskAdditional03 {

	public static void main(String[] args) {
		String str = "121212";		
		System.out.println("PLease provide text from Vovochka:");
		str = new Scanner(System.in).next();

		int value = findValue(str);
		if (value != -1) {
			System.out.println("Here is decrypted info: " + value);
		} else {
			System.out.println("This text doesn't belong to Vovochka!");
		}
		
	}
	
	static int findValue(String str) {
		int result = -1;

		for (int i = 1; i < str.length(); i++) {
			if (str.length() % i == 0) {
				String[] arr = new String[str.length() / i];
				for (int j = 0; j < arr.length; j++) {
					arr[j] = str.substring(j * i, j * i + i);
				}
				
				boolean isDigit = true;
				for (int k = 0; k < arr.length - 1; k++) {
					if (! arr[k].equals(arr[k+1]) ) {
						isDigit = false;
						break;
					}
				}				
				
				if (isDigit) {
					result = Integer.parseInt(arr[0]);
					break;
				}
			}
		}

		return result;
	}

}
