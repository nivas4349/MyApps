package tekSystems;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClassA {

	public static void main(String[] args) {
		System.out.println(isLeapYear(2016));
	}

	static boolean isLeapYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.FEBRUARY, 1);
		int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		return (days > 365);
	}

	static boolean isLeapYearGr(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
}
