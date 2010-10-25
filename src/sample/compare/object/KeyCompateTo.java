package sample.compare.object;

public class KeyCompateTo implements IKey, Comparable<KeyCompateTo> {

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

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		KeyCompateTo other = (KeyCompateTo) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}

	public KeyCompateTo() {
		super();
	}

	@Override
	public int compareTo(KeyCompateTo o) {
		return this.hashCode() - o.hashCode();
	}

}
