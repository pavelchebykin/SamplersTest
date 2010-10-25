package sample.compare.object;

public class KeyHashAndEqual implements IKey {

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyHashAndEqual other = (KeyHashAndEqual) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public KeyHashAndEqual() {
		super();
	}

}
