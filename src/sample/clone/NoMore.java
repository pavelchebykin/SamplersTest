package sample.clone;

//Клонирование отключено с генерацией исключительного события:
public class NoMore extends IsCloneable {
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
