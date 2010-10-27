package sample.copyctor;

public class GreenZebra extends Tomato {
	GreenZebra() {
		addQualities(new ZebraQualities());
	}

	GreenZebra(GreenZebra g) {
		super(g); // Вызов Tomato(Tomato)
		// Восстановление верных качеств:
		addQualities(new ZebraQualities());
	}

	void evaluate() {
		ZebraQualities zq = (ZebraQualities) getQualities();
		// Какие-нибудь операции с качествами
		// ...
	}

}
