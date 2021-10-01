package P2;

public class X {

	private int y2 = 101; // private variable
	long k2 = 10001; // default variable
	protected float j2 = (float) 3.21; // protected variable
	public char p2 = 'k';

	public void methodPublic() {

		System.out.println("X case: methodPrivate");
		System.out.println("X value of private int " + y2);
		System.out.println("X value of default long " + k2);
		System.out.println("X value of protected float " + j2);
		System.out.println("X value of public char " + p2);
	}
}
