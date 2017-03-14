package finance.common;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CommonConstants {

	public static final Date MAX_DATE = new GregorianCalendar(9999, Calendar.DECEMBER, 31).getTime();
	public static final Date MIN_DATE = new GregorianCalendar(1, Calendar.JANUARY, 1).getTime();

	public static final Calendar MAX_DATE_CALENDAR = new GregorianCalendar(9999, Calendar.DECEMBER, 31);
	public static final Calendar MIN_DATE_CALENDAR = new GregorianCalendar(1, Calendar.JANUARY, 1);

}
