package sample.copyctor;

public class Fruit {
	private FruitQualities fq;
	private int seeds;
	private Seed[] s;

	Fruit(FruitQualities q, int seedCount) {
		fq = q;
		seeds = seedCount;
		s = new Seed[seeds];
		for (int i = 0; i < seeds; i++)
			s[i] = new Seed();
	}

	// Прочие конструкторы:
	// ...
	// Конструктор копирования:
	Fruit(Fruit f) {
		fq = new FruitQualities(f.fq);
		seeds = f.seeds;
		s = new Seed[seeds];
		// Быстрый вызов всех конструкторов копирования:
		for (int i = 0; i < seeds; i++)
			s[i] = new Seed(f.s[i]);
		// Действия других конструкторов копирования...
	}

	// Для обеспечения размещения полученных конструкторов (или других
	// методов) в различных качествах:
	protected void addQualities(FruitQualities q) {
		fq = q;
	}

	protected FruitQualities getQualities() {
		return fq;
	}

}
