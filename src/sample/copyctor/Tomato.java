package sample.copyctor;

public class Tomato extends Fruit {
	Tomato() {
		super(new FruitQualities(), 100);
	}

	Tomato(Tomato t) { // Конструктор копирования
		super(t); // Подмена для базового конструктора копирования
		// Прочие операции конструктора копирования...
	}
}
