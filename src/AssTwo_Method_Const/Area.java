package AssTwo_Method_Const;

public class Area {
     int value;
     
     String name;
     
	public Area() {
    	System.out.println("This is the default constructor.");
    }
	
	public  Area(int s1, long s2) {
		String name = "rectangle";
		long value = s1 * s2;
		display(value, name);
	}	
	
	public void display(long value, String name) {	
	    System.out.println("Area of your "+ name +" : " + value);
	} 

	
	public Area(float r) {
		String name = "Circle";
		float value = (float) ((3.14) * r *r);
		display(value, name);
	}		
	
	public void display(float value, String name) {	
	    System.out.println("Area of your "+ name +" : " + value);
	} 
	
	public Area(int s) {
		String name = "square";
		int value = s * s;
		display(value, name);
	}	
	
	public void display(int value, String name) {	
	    System.out.println("Area of your "+ name +" : " + value);
	} 
	
	public static void area(int b, int h) {
		System.out.println("Area of your triangle : " + (0.5 *b * h));
	}
	
	public static void area(int d1, int d2, int x) {
		System.out.println("Area of your rhombus : " + ((d1 * d2)/ x));
	}
	
	public static void main(String[] args) {
		
		Area xyz = new Area(12,12l);
		Area xy = new Area(12);
		Area x = new Area(1.2f);
		area(8, 9);
		area(2,2,2);
		
		
	}

}
