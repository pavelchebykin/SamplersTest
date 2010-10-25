package sample.compare.nan;

public class CompareNaN {
	public static void main(String[] args) {
		compareNan();
		compareInfinity();
	}

	private static void compareInfinity() {
		Float x = 0.0f/0.0f;
		Float y = 0.0f/0.0f;
		System.out.println("x="+x);
		System.out.println("x==x: "+(x==x));
		if ( x <= y && 
			 x >= y && 
			 x != y) {
			System.out.println("OOPS!");
		}
	}

	private static void compareNan() {
		Float x = 1.0f/0.0f;
		Float y = 1.0f/0.0f;
		System.out.println("x="+x);
		System.out.println("x==x: "+(x==x));
		if ( x <= y && 
			 x >= y && 
			 x != y) {
			System.out.println("OOPS!");
		}
	}
}
