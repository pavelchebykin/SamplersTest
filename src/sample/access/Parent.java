package sample.access;

public class Parent {
	private int aParam;

	protected void setaParam(int aParam) {
		this.aParam = aParam;
	}

	public int getaParam() {
		return aParam;
	}

	public Parent() {
		super();
		this.aParam = 234;
	}
	
}
