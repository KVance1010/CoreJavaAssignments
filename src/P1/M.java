package P1;

public class M {

	private int y = 10;                //private variable
    long k = 1000;                     //default variable 
    protected float j = (float) 3.2;   //protected variable
    
    public void methodPublic () {      //protected method
    	methodPrivate();
    }
    
    protected void methodProtected() {
    	methodPrivate();
    }
    
    void methodDefault () {
    	methodPrivate();
    }
    
    private void methodPrivate() {
    	
    	System.out.println("M case: methodPrivate");
    	System.out.println("M value of private int " + y);
    	System.out.println("M value of default long " + k);
    	System.out.println("M value of protected float "+ j);
    }
}
