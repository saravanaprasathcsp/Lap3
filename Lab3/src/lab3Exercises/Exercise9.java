/*
*  Create a method to accept date and print the duration in days, months and years with regards to current system date.
*  @author Saravana prasath c
*  
*/

package lab3Exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jdk.jfr.Period;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputDate = getInputDate();
		   findDuration(inputDate);

	  }

	private static void findDuration(String inputDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enteredDate = LocalDate.parse(inputDate,formatter);
		LocalDate end = LocalDate.now();
	    Period period = enteredDate.until(end);
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());

	}

	private static String getInputDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		return input;

	}

}
