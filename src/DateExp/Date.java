package DateExp;


public class Date {

	public static void main(String[] args) {
		
		long millis = System.currentTimeMillis();
		java.util.Date date = new java.util.Date(millis);
		System.out.println(date);         // Prints Wed Mar 27 08:22:02 PDT 2021
		
	}

}
