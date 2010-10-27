package sample.initobject;

public class TestInitObject {
	public static void main(String[] args) {
		System.out.println("1.test Parent");
		Parent p = new Parent();
		
		System.out.println("2.test ChildParent");
		ChildParent cp = new ChildParent();
		
		System.out.println("3.test ChildChildParent");
		ChildChildParent ccp = new ChildChildParent();
	}

}
