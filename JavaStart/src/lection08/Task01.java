package lection08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Создайте консольный «текстовый редактор» с 
 * возможностью сохранения набранного текста в файл.*/

public class Task01 {

	public static void main(String[] args) {
		String fileName = "new.txt";
		String terminator = "#save";

		System.out.println("Please provide file name to create");
		Scanner sc = new Scanner(System.in);
		fileName = sc.nextLine();

		System.out.println("Excelent! Now please provide your text to save. For saving file print \"" 
				+ terminator
				+ "\" line and press Enter");

		File file = new File(fileName);
		String inputLine = "";
		try (PrintWriter pw = new PrintWriter(file)) {
			for (; !inputLine.equals(terminator); inputLine = sc.nextLine()) {
				inputLine = sc.nextLine();
				pw.println(inputLine);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Done.");
	}

}
