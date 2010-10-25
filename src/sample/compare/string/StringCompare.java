package sample.compare.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringCompare {
	public static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	private static void test4() {
		String str1 = "string";
		String str2 = new String("string");
		System.out.println(FORMAT.format(new Date()) + " Test #4: " + (str1.intern()==str2.intern() ? "the same" : "not the same"));
	}

	private static void test3() {
		String str1 = "string";
		String str2 = new String("string");
		System.out.println(FORMAT.format(new Date()) + " Test #3: " + (str1==str2 ? "the same" : "not the same"));
	}

	private static void test2() {
		String str1 = "string";
		String str2 = "str";
		String str3 = "ing";
		System.out.println(FORMAT.format(new Date()) + " Test #2: " + (str1==(str2+str3) ? "the same" : "not the same"));
	}

	private static void test1() {
		String str1 = "string";
		String str2 = "string";
		System.out.println(FORMAT.format(new Date()) + " Test #1: " + (str1==str2 ? "the same" : "not the same"));
	}
}
