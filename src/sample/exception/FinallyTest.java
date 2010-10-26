package sample.exception;

public class FinallyTest {

	public void testDoubleException() {
		try {
			int[] arr = new int[] {1, 2, 3}; 
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} 
		finally {
			int a = 0;
			double b = 100/a;
		}
	}

}
