package lection07;

import java.util.Date;

/*Написать программу которая вернет количество миллисекунд 
 * прошедших от такого же числа, но в прошлом месяце до сегодняшней даты.
 * Например если сегодня 3 августа, то узнать сколько миллисекунд прошло с 3 июля.*/

public class Task01 {

	public static void main(String[] args) {
		Date dateToday = new Date();
		Date dateBefore = new Date();
		dateBefore.setMonth(dateToday.getMonth() - 1);
		long timeDifference = dateToday.getTime() - dateBefore.getTime();
		
		System.out.println("Today is: " + dateToday);
		System.out.println("Previous month is " + dateBefore);
		System.out.println("Time difference in ms is: " + timeDifference);
	}

}
