package sample.copyctor;

public class ZebraQualities extends FruitQualities {
	private int stripedness;

	ZebraQualities() { // Конструктор по умолчанию
		// для совершения каких-либо необходимых действий...
	}

	ZebraQualities(ZebraQualities z) {
		super(z);
		stripedness = z.stripedness;
	}

}
