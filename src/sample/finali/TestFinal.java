package sample.finali;

public class TestFinal {
	
	public static void main(String[] args) {
		try {
			TestListFinal tf = new TestListFinal();
			tf.test();
			try {
				TestStatic.staticMethod();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
