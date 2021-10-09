package AbstractDemo;

abstract class Bike {
	
	Bike(){
		System.out.println("bike is created");
	}
	
	abstract void run1();
	void changeGear() {
		System.out.println();
	}
	
}
