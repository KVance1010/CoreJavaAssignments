package AbstractDemo;

abstract class honda extends Bike {
	honda(){
		System.out.println("honda is created");
	}
	//changedGear(), run1()
	
	abstract void run();
	abstract void run1();
}
