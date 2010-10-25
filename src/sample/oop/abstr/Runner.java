package sample.oop.abstr;

public class Runner {
	public static void main(String[] args) {
		IFoo foo = new Foo();
		foo.test();
		
		IFoo foo2 = new Foo2();
		foo2.test();
	}
}
