package DateExp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;     // only needed for gregorianCaldar portion

public class SimpleDateEX {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		// GregorianCalendar options
		
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println(year + " " + month);
		System.out.println(dayOfMonth + " " + dayOfWeek);
		System.out.println(weekOfYear + " " + weekOfMonth);

	}

}
