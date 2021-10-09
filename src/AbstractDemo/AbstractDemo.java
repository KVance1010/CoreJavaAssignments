package AbstractDemo;

abstract class AbstractDemo {

	private String name = "abc";
	
	AbstractDemo(){
		System.out.println("inside the abstact class..");
	}
	public void myMethod(){
		System.out.println("Hello" + name);
	}
	abstract public void anotherMethod();
		
}


