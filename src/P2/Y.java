package P2;

import P1.N;
import P1.M;
public class Y extends N{

	public void methodN() {
		new N().methodPublic();
	}	
		
	public static void main(String[] args) {
		new N().methodPublic();
		new M().methodPublic();
		new X().methodPublic();
     

	}

}
