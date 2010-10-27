package sample.initobject;

public class Parent {
	protected int i;
	public Parent() {
		i = 1;
		System.out.println("Parent()");
		System.out.println("init " + getClass().getName() + " " + i);
	}
}
