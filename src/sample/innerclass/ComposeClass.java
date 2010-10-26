package sample.innerclass;

public class ComposeClass {
	private int a;
	public class InnerClass {
		public int getA() {
			a = 200;
			return a;
		}
	}
	
	public int getA(){
		final int s = 300;
		class LocalClass {
			public int modifyA() {
				return s;
			}
		}
		return (new LocalClass()).modifyA();
	}
	public void startFoo () {
		final int i = 0;
		Runnable ss = new Runnable() {
			
			@Override
			public void run() {
				int j = i;
			}
		};
		
	}

}
