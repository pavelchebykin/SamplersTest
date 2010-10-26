package sample.compare.object;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CompareObject {
	public static void main(String[] args) {
		try {
			overridingEquals();
			overridingHashCode();
			overridingHCE();
			overridingCompareTo();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void overridingCompareTo() {
		System.out.println(KeyCompateTo.class.getName());
		try {
			checkHashMap(KeyCompateTo.class);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		try {
			checkTreeMap(KeyCompateTo.class);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void overridingHCE() {
		System.out.println(KeyHashAndEqual.class.getName());
		try {
			checkHashMap(KeyHashAndEqual.class);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		try {
			checkTreeMap(KeyHashAndEqual.class);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void overridingHashCode() {
		System.out.println(KeyHashCode.class.getName());
		try {
			checkHashMap(KeyHashCode.class);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		try {
			checkTreeMap(KeyHashCode.class);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void overridingEquals() {
		System.out.println(KeyEquals.class.getName());
		try {
			checkHashMap(KeyEquals.class);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		try {
			checkTreeMap(KeyEquals.class);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		checkHashSet();
		checkSortedSet();
		
	}

	private static void checkSortedSet() {
		// TODO Auto-generated method stub
		
	}

	private static void checkTreeMap(Class<? extends IKey> clazz) {
		final int border = 4;
		System.out.println("Start check influence to TreeMap");
		Map<IKey, String> map = new TreeMap<IKey, String>();
		fill(clazz, map, border, true);
		check(clazz, map, border);
		System.out.println("end overridding equals");		
	}

	private static void checkHashSet() {
		// TODO Auto-generated method stub
		
	}

	private static void checkHashMap(Class<? extends IKey> clazz) {
		final int border = 4;
		System.out.println("Start check influence to HashMap");
		Map<IKey, String> map = new HashMap<IKey, String>();
		fill(clazz, map, border, true);
		check(clazz, map, border);
		System.out.println("end overridding equals");		
	}

	private static void check(Class<? extends IKey> clazz, Map<IKey, String> map, int border) {
		for (int i = 0; i < border; i++) {
			IKey key = null;
			try {
				key = clazz.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			key.setKey(i);
			if (map.get(key) == null) {
				System.out.println("null value - " + "key:"+key.getKey());
				continue;
			}
			if (map.get(key).intern() != String.valueOf(i).intern()) {
				System.out.println("not equal - " + "key:"+key.getKey()+" map value:"+map.get(key).intern());
			}
		}
	}

	private static void fill(Class<? extends IKey> clazz, Map<IKey, String> map, int border, boolean b) {
		
		for (int i = 0; i < border; i++) {
			IKey key = null;
			try {
				key = clazz.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			key.setKey(i);
			map.put(key, String.valueOf(((b)?i:-1*i)));
		}		
	}
}
