package sample.oop.abstr;

/**
 * Есть такая иерархия классов:
 * interface IA
 * abstract class AA implements IA
 * class A extends AA implements IA
 * Нахрена A implements IA?
 * 
 * @author user
 *
 */



public class Foo extends AFoo implements IFoo{
	private int paramA;

	public void setParamA(int paramA) {
		this.paramA = paramA;
	}

	public int getParamA() {
		return paramA;
	}

	public Foo() {
		super();
	}
	
}
