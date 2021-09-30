package P1;

public class N {

	protected long y1 = 10;         //Protected variable
    public int k1 = 1000;           //Public variable 
    double v1 = 4.5;                //double variable
    
    public void methodPublic () {   //protected method
    	methodPrivate();
    }
    
    protected void methodProtected() {
    	methodPrivate();
    }
    
    void methodDefault () {
    	methodPrivate();
    }
    
    private void methodPrivate() {
    	
    	System.out.println("Case N: methodPrivate");
    	System.out.println("N value of proctected value long " + y1);
    	System.out.println("N value of public int " + k1);
    	System.out.println("N value of default double "+ v1);
    } 
}
