package sample.finali;

public class TestStatic {

	public static int[] qq;
	static {
		qq = new int[2];
		for (int i = 0; i < 3; i++) {
			qq[i] = i;
		}
	}
	
	public static void staticMethod() throws Exception {
		throw (new Exception("ss"));		
	}

	
}
