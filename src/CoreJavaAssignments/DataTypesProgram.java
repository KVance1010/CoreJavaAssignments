package CoreJavaAssignments;

public class DataTypesProgram {
    
	public static void typeCastExample() {
	
	// -------TYPECAST BETWEEN INT AND LONG-------//
		
	int i = 100;
    long l = i;    // automatic type conversion from int to long
    System.out.println("long value " + l);
    
    int o = (int) l;
    System.out.println("int value "+ o);
    
    char t = (char) i;   // explicit type cast from long to int
    System.out.println("char value "+ t);
    
    // ------- TYPECAST FROM DOUBLE AND FLOAT ------- //
    
    double d = 19067566565868.007969847578776565675;
    float r = (float)d; // explicit typecast from double to float
    System.out.println("float value " + r);
    System.out.println("double value " + d);
    
    // ------- TYPECAST FROM DOUBLE --> LONG -- > INT in series ------- //
    
    double d2 = 100.04;
    long l2 = (long) d2; // explicit type casting required 
    int i2 = (int) l2;   // explicit type casting required
    System.out.println("Double value " + d2);
    System.out.println("Long value " +  l2);
    System.out.println("Int value " + i2);
    
    // ------- TYPECAST BETWEEN LONG AND FLOAT -------//
    
    float f = 1;    // automatic type conversion from long to float
    System.out.println ("float value " + f);
    
	}
}
