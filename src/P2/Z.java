package P2;
import P1.M;
import P1.P;

public class Z extends M {

	public static void main(String[] args) {
		new Y().methodN();
		new M().methodPublic();
		new P().methodPublic();
		//new P().methodProtected();
		//new P().methodDefault();
		//new Z().methodProtected();
		//new Z().methodPublic();

	}

}
