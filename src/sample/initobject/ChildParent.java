package sample.initobject;

public class ChildParent extends Parent {

	public ChildParent() {
		i = 2;
		System.out.println("ChildParent()");
		System.out.println("init " + getClass().getName() + " " + i);
	}

}
