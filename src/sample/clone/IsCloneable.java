package sample.clone;

//Соблюдены все необходимые для клонирования условия:
public class IsCloneable extends Ordinary implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
