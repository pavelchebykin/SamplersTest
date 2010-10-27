package sample.copyctor;

public class FruitQualities {
	private int weight;
	private int color;
	private int firmness;
	private int ripeness;
	private int smell;

	// и т.д.
	FruitQualities() { // Конструктор по умолчанию
		// для совершения каких-либо необходимых действий...
	}

	// Прочие конструкторы:
	// ...
	// Конструктор копирования:
	FruitQualities(FruitQualities f) {
		weight = f.weight;
		color = f.color;
		firmness = f.firmness;
		ripeness = f.ripeness;
		smell = f.smell;
		// и т.д.
	}

}
