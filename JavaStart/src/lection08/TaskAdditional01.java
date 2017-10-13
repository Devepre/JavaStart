package lection08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*Напишите метод для считывания двухмерного массива из файла 
 * (размер массива заранее неизвестен, определите его сами 
 * на основе данных в файле)*/

public class TaskAdditional01 {

	public static void main(String[] args) {		
		/*example of input file
		2,5,2
		67,34,75,234,234
		0,1,2
		*/		
		String fileName = "a.txt";
		
		int[][] data = arrayStringToIntConvert(getArray(fileName));
		displayArray(data);

	}

	public static String[][] getArray(String fileName) {
		String separator = ",";
		String[][] dataString;

		dataString = new String[getLinesCount(fileName)][];

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			for (int i = 0; (line = br.readLine()) != null; i++) {
				dataString[i] = line.split(separator);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return dataString;
	}

	private static int[][] arrayStringToIntConvert(String[][] array) {
		int[][] data = new int[array.length][];

		for (int i = 0; i < array.length; i++) {
			data[i] = new int[array[i].length];

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = Integer.parseInt(array[i][j]);
			}
		}

		return data;
	}

	private static int getLinesCount(String fileName) {
		int lines = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			for (; br.readLine() != null; lines++) {
				;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return lines;
	}
	
	private static void displayArray(int[][] array) {
		if (array != null) {
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}			
		}else {
			System.out.println("Array is empty");
		}
	}

}
