package lection08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*Напишите метод для создания в файле ASCII – арта, т.е. 
 * фигуры размером 40х40 символов заполненных символами 
 * образующих узор.*/

public class TaskAdditional03 {

	public static void main(String[] args) {
		int size = 40;
		String fileName = "a.txt";
		String[] art = generateArt(size);
		saveArt(art, fileName);
		System.out.println("Please review " + fileName + " file for result");

	}
	
	public static void saveArt(String[] art, String fileName) {
		try (PrintWriter pw = new PrintWriter(fileName)){
			for (String string : art) {
				pw.println(string);
			}			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String[] generateArt(int input) {
		String[] data = new String[input];
		StringBuilder row;
		boolean top;
		char drawCh;
		for (int i = 1; i <= input; i++) {
			row = new StringBuilder();
			for (int j = 1; j <= input; j++) {
				top = i <= (input / 2);
				drawCh = '*';
				if (top) {
					if ((j > (input - i + 1)) || j < i) {
						drawCh = ' ';
					}
				} else {
					if ((j < input - i + 1) || (j > i)) {
						drawCh = ' ';
					}
				}
				row.append(drawCh);				
			}
			data[i - 1] = row.toString();			
		}
		return data;
	}
}
