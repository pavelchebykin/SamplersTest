package sample.access;

public class AccessModify {
	public static void main(String[] args) {
		ParentProtected pp = new ParentProtected();
		System.out.println("before:" + pp.getaParam());
		pp.setaParam(890);
		System.out.println("after:" + pp.getaParam());
		ParentParentProtected ppp = new ParentParentProtected();
	}
}
