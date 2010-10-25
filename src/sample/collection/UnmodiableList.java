package sample.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class UnmodiableList {
	public static void main(String[] args) {
		try {
			testArrayList();
			testUnmodifiableList();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void testUnmodifiableList() {
		System.out.println("testUnmodifiableList");
		String[] arrayStr = {"A", "B", "C"};
		List<String> strs = new ArrayList<String>(Arrays.asList(arrayStr));
		System.out.println("testUnmodifiableList before");
		print(strs);
		
		copyAndDelete(Collections.unmodifiableList(strs));
		System.out.println("testUnmodifiableList after");
		print(strs);
		
	}

	private static void testArrayList() {
		System.out.println("testArrayList");
		String[] arrayStr = {"A", "B", "C"};
		List<String> strs = new ArrayList<String>(Arrays.asList(arrayStr));
		System.out.println("testArrayList before");
		print(strs);
		
		copyAndDelete(strs);
		System.out.println("testArrayList after");
		print(strs);
		
	}

	private static void copyAndDelete(List<String> strs) {
		for (Iterator<String> it = strs.iterator(); it.hasNext();) {
			it.next();
			it.remove();
		}
		
	}

	private static void print(Iterable<String> strs) {
		for (String string : strs) {
			System.out.println(string);
		}
	}
}
