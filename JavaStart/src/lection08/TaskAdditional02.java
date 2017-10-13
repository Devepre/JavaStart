package lection08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*Считайте текст на английском языке и выведите статистику 
 * по частоте использования букв в тексте (т.е. буква- количество 
 * использований), причем первыми должны выводиться буквы 
 * используемые чаще всего.*/

public class TaskAdditional02 {

	public static void main(String[] args) {
		String fileName = "a.txt";
		readAndCount(fileName);
		
	}

	public static void readAndCount(String fileName) {
		int[] stat = new int[Character.MAX_VALUE];
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			int ch;
			while ((ch = br.read()) != -1) {
				stat[ch]++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}	
		
		int max = findMax(stat);
		
		for (int i = 0; i < stat.length; i++) {
			if (stat[i] > 0) {
				for (int j = 0; j < stat.length; j++) {
					if (stat[j] == max) {
						System.out.format("%s -> %d", (char)j, stat[j]);
						System.out.println();
						stat[j] = -1;
					}					
				}	
				max--;
			}
		}
	}		
	
	private static int findMax(int[] array) {
		int max = 0;
		for (int element : array) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
}
