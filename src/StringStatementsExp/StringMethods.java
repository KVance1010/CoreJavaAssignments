package StringStatementsExp;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Meklo";
		String s4 = "Hemelo";
		String s5 = "HELLO";
		String s6 = "hello";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.compareToIgnoreCase(s6));
		System.out.println();

		s1.concat("Sample");
		System.out.println(s1);
		s1 = s1.concat(" Sample example for String Concat");
		System.out.println(s1);
		System.out.println();

		s1 = "Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println();

	}

}
