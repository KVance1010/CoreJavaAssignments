package AbstractDemo;

public class BasicAbstractExample extends AbstractDemo{

	BasicAbstractExample(){
		super();
		System.out.println("Inside child class...");
	}
	public void anotherMethod() {
		System.out.println("Abstract method  : ");
	}
	
	public static void main(String[] args) {
		AbstractDemo obj = new BasicAbstractExample();
		
		obj.anotherMethod();
		obj.myMethod();
	}

}
