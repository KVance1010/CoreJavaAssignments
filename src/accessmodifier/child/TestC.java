package accessmodifier.child;

import accessmodifier.TestB;

public class TestC {
    
	void defaultMethod(){
        System.out.println("inside the default method of class TestC");
    }
    
	public static void main(String[] args) {
		new TestB().methodPublic();

	}

}
