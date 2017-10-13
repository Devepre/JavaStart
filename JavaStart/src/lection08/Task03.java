package lection08;

import java.io.File;
import java.util.Scanner;

/*Реализуйте метод который вывведет на экран список всех 
 * каталогов котоорые «лежат» в каталоге который будет 
 * параметром этого метода.*/

public class Task03 {

	public static void main(String[] args) {
		String fileName = "";
		System.out.println("Please enter directory path:");
		Scanner sc = new Scanner(System.in);
		fileName = sc.nextLine();
		sc.close();
		File file = new File(fileName);
		printDirs(file);

	}
	public static void printDirs(File dir) {
		if (dir.isDirectory()) {
			File[] array = dir.listFiles();
			for (File item : array) {
				if (item.isDirectory()) {
					System.out.println(item.getName());
				}
			}
		} else {
			System.out.println(dir.getName() + " isn't directory");
		}
	}
}
