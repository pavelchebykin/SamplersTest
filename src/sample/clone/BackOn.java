package sample.clone;

public class BackOn extends NoMore {
	private BackOn duplicate(BackOn b) {
		// Создается и возвращается копия b.
		// Это простейшее копирование, использованное лишь в качестве примера:
		return new BackOn();
	}

	public Object clone() {
		// Метод NoMore.clone() не вызывается:
		return duplicate(this);
	}

}
