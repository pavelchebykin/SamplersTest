package sample.clone;

public class TryMore extends NoMore {
	public Object clone() throws CloneNotSupportedException {
		// Вызов NoMore.clone(), что приводит к появлению исключительного
		// события:
		return super.clone();
	}

}
