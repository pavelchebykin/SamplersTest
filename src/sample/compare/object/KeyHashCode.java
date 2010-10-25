package sample.compare.object;

public class KeyHashCode implements IKey {

	private int i;
	
	@Override
	public void setKey(int i) {
		this.i = i;

	}

	@Override
	public int getKey() {
		return i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	public KeyHashCode() {
		super();
	}
	
}
