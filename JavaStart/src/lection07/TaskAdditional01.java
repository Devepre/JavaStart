package lection07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*Ввести с консоли дату. Сравнить ее с текущей датой 
 * в системе. Вывести отличающиеся части (год, месяц) на экран.*/

public class TaskAdditional01 {

	public static void main(String[] args) {
		System.out.println("Please enter date dd:MM:yyyy: ");
		String input = new Scanner(System.in).next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
		Date inputDate = null;
		try {
			inputDate = sdf.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar currentCalendar = Calendar.getInstance();
		Calendar inputCalendar = Calendar.getInstance();
		inputCalendar.setTime(inputDate);

		System.out.println("Difference:");

		if (inputCalendar.get(Calendar.MONTH) != currentCalendar.get(Calendar.MONTH)) {
			System.out.println("Month: " + (inputCalendar.get(Calendar.MONTH) + 1));
		}

		if (inputCalendar.get(Calendar.YEAR) != currentCalendar.get(Calendar.YEAR)) {
			System.out.println("Year: " + inputCalendar.get(Calendar.YEAR));
		}

	}

}
