package AssFunctionOverloading;

public class FunctionOverloading {

	public static int calculate(int x) {
		int c = x + x;
		return c;
	}

	public static float calculate(float a) {
		float j = (float) (3.14159 * (a * a));
		return j;
	}

	public static int calculate(int s, int s2) {
		int r = s * s2;
		return r;
	}

	public static void main(String[] args) {
		// FunctionOverloading x1 =new FunctionOverloading();
		System.out.println(FunctionOverloading.calculate(9));
		System.out.println(FunctionOverloading.calculate(4, 9));
		System.out.println(FunctionOverloading.calculate(2.0f));

	}

}
