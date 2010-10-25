package sample.compare.object;

public class KeyEquals implements IKey{
	private int key;

	public void setKey(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public KeyEquals() {
		super();
	}

	public KeyEquals(int key) {
		super();
		this.key = key;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyEquals other = (KeyEquals) obj;
		if (key != other.key)
			return false;
		return true;
	}	
}
