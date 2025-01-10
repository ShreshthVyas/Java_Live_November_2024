package Lecture17;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
//		ArrayList<Character> list1 = new ArrayList<>();
		
		list.add("abc");
		list.add("abcd");
		list.add("abce");
		list.add("c");
		list.add("bc");
		list.add("b");
//		System.out.println(list);
//		System.out.println(list.size());
		
//		list.addFirst("cde");
//		list.addLast("gh");
//		System.out.println(list);
//		
//		list.add(3, "z");
//		System.out.println(list);
//		
////		list.remove(2);
//		
//		list.set(1, "xcv");
//		System.out.println(list);
//		
//		System.out.println(list.contains("abc"));
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for (String s : list) {
//			System.out.println(s);
//		}
		
//		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
//		ArrayList<Long>  list1 = new ArrayList<>();
//		
//		list1.add(9l);
//		list1.add(11l);
//		list1.add(-1l);
//		list1.add(13l);
//		list1.add(14l);
//		
//		Collections.sort(list1);
//		System.out.println(list1);
	}

}
