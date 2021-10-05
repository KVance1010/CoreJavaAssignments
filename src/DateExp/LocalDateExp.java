package DateExp;
//first part
import java.time.LocalDate;
import java.time.ZoneId;

// second part
import java.time.LocalTime;
// import java.time.ZoneId;


// part three
///import java.time.LocalDate;
import java.time.Period;

public class LocalDateExp {

	public static void main(String[] args) {
		
		       // Prints Today's Date: 2021-06-14
		
		LocalDate localDateToday = LocalDate.now();
		System.out.println("Today's Date : " + localDateToday);

		     // Prints Today's Date at Zone America/San_Diego : 2021-06-14
		
		LocalDate localDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Today's Date at Zone America/San_Diego :" + localDateZone);
		
		
	 	   // start of 2nd part 
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Currnet Time :" + currentTime);
		LocalTime localTimeZone = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Time at America/Los_Angeles : " + localTimeZone);
		
		
		// third part (not working)
//		
//		LocalDate localDate1 = LocalDate.of(2016, 06, 16);
//		LocalDate  localDate2 = LocalDate.of(2017,9, 15);
//		Period = Period.between(localDate1,  localDate2);
//		System.out.println(" 16-June-2016 to 15-September-2017 : years ("
//		+ period.getYears() + "), Months(" + period.getMonths() + "), Days(" + period.getDays() + ")");
//		
	}

}
