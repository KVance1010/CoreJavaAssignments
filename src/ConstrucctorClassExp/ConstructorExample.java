package ConstrucctorClassExp;

public class ConstructorExample {

	int id; // class variable
	String name;

	public ConstructorExample() { // default constructor

		id = 10;
		name = "Hello";
		System.out.println(" I am inside the default constructor");
	}

	void display() {

		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// creating objects
		ConstructorExample s1; // Instance Variables
		s1 = new ConstructorExample();
		ConstructorExample s2 = new ConstructorExample(); // object of class

		// displaying values of the object
		s1.display();
		s2.display();

	}

}
