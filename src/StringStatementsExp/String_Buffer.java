package StringStatementsExp;

public class String_Buffer {

	public static void main(String[] args) {
		
		// append
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append("Java");
		System.out.println(sb);             // Prints Welcome Java
		
		// insert

		StringBuffer st = new StringBuffer("Hello");
		st.insert(1, "Java");
		System.out.println(st);           // Prints WJavaelcome
		
		// 

	}

}
