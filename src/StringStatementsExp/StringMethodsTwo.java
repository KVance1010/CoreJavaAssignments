package StringStatementsExp;

public class StringMethodsTwo {

	public static void main(String[] args) {
		String s1 = "Java string split method sample";
		String[] words = s1.split("\\s"); // splits the string based on whitespace

		// using java for each loop to print elements of string array

		for (String w : words) {
			System.out.println(w);
		}

		String s2 = "SamppleSubstring";
		System.out.println(s2.substring(2, 4));
		System.out.println(s2.substring(2));

	}
}
