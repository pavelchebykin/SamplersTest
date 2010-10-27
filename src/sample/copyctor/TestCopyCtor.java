package sample.copyctor;

public class TestCopyCtor {
	public static void ripen(Tomato t) {
		// Использование "конструктора копирования":
		t = new Tomato(t);
		System.out.println("В зрелых t это " + t.getClass().getName());
	}

	public static void slice(Fruit f) {
		f = new Fruit(f); // Хмм... будет ли это работать?
		System.out.println("В нарезаных ломтиками f это "
				+ f.getClass().getName());
	}

	public static void main(String[] args) {
		Tomato tomato = new Tomato();
		ripen(tomato); // OK
		slice(tomato); // Ой!
		GreenZebra g = new GreenZebra();
		ripen(g); // Ой!
		slice(g); // Ой!
		g.evaluate();
	}
}
