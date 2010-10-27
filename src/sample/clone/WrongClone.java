package sample.clone;

//Переопределяется clone, но не реализуется
//интерфейс Cloneable:
public class WrongClone extends Ordinary {
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Возвращает исключительную ситуацию
	}

}
