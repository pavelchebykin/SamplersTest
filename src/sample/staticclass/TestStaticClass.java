package sample.staticclass;

public class TestStaticClass {
	static public class StaticClass {
		private int i;
		protected void setI(int m) {
			i = m;
		}
	}

	public static void main(String[] args) {
		StaticClass sc = new StaticClass();
		sc.setI(123);
		UserStaticClass usc = new UserStaticClass();
		usc.setI(345);
	}
}
