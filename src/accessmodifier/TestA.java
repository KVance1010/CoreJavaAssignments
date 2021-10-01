package accessmodifier;

class TestA {

	private int y = 10; // private variable

	long k = 1000; // default variable

	public void methodPublic() { // protected method
		methodPrivate();
	}

	protected void methodProtected() {
		methodPrivate();
	}

	void methodDefault() {
		methodPrivate();
	}

	private void methodPrivate() {

		System.out.println("Case TestA: methodPrivate");
		System.out.println("Value of private value y " + y);
		System.out.println("Value of long " + k);
	}

}
