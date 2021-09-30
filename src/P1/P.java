package P1;

public class P {

	public static void main(String[] args) {
		new M().methodPublic();
		new M().methodProtected();
		new M().methodDefault();
		System.out.println();
		
		
		new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault();
		System.out.println();

		
	}
	
	public void methodPublic() {
		System.out.println("Class P: methodPublic");
	}
	
	protected void methodProtected() {
		System.out.println("Class P: methodProtected");
	}
	
	void methodDefault() {
		System.out.println("Class P: methoidDefault");
	}
	
	private void methodPrivate() {
		System.out.println("Class P: methodPrivate");
	}
	
}
