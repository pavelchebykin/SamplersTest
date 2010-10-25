package sample.finali;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListFinal {
	 final static List<String> _list = new ArrayList<String>();
	 final List<String> list = new LinkedList<String>();
	 
	 public void test() {
	   _list.add("Hello world!");
	   // Так нельзя, т.к. объявлена final ссылка
//	   list = new ArrayList<String>();
	 }
}
