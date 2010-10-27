package sample.initobject;

public class ChildChildParent extends ChildParent {
	public ChildChildParent() {
		i = 3;
		System.out.println("ChildChildParent()");
		System.out.println("init " + getClass().getName() + " " + i);
	}
}
