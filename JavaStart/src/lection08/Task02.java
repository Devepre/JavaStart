package lection08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/*Напишите метод для сохранения в текстовй файл 
 * двухмерного массива целых чисел.*/

public class Task02 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 2, 5, 2 }, { 67, 34, 75 }, { 0, 1, 2 } };		
		String fileName = "a.txt";

		System.out.println("Saving array to file " + fileName);
		if (saveArrayToFile(array, fileName)) {
			System.out.println("Saved succesfully");
		} else {
			System.out.println("Error occured during saving");
		}

	}

	public static boolean saveArrayToFile(int[][] array, String fileName) {
		boolean isSuccesfull = true;
		if (array!= null) {
			try (PrintWriter pw = new PrintWriter(fileName)) {
				for (int[] arr : array) {
					pw.println(Arrays.toString(arr));
				}
			} catch (FileNotFoundException e) {
				isSuccesfull = false;
				System.out.println(e.getMessage());
			}			
		} else {
			isSuccesfull = false;
		}
		
		return isSuccesfull;
	}

}
