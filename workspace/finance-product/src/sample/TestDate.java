package sample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date d = new GregorianCalendar(9999, Calendar.DECEMBER, 31).getTime();

		System.out.println(d);

		d = new GregorianCalendar(1, Calendar.JANUARY, 01).getTime();

		System.out.println(d);

		System.out.println(new Date());
	}

}
