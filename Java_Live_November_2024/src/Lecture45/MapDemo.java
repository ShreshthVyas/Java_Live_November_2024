package Lecture45;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Integer>  map = new HashMap<>();
		
		//O(1)
//		map.put("A", 10);
//		map.put("B", 20);
//		map.put("C", 15);
//		map.put("E", 34);
//		map.put("F", 100);
//		map.put("G", 1);
//		map.put("A", 29);
//		map.put(null, 1000);
////		map.put(null,111);
////		map.put(null, null);
//		map.put("null", 234);
//		
//		//O(1)
////		map.remove("A");
////		map.remove("AA");
//		
//		//O(1)
//		
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("AA"));
//
//		System.out.println(map);
		
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//		map.put("A", 10);
//		map.put("B", 20);
//		map.put("C", 15);
//		map.put("E", 34);
//		map.put("F", 100);
//		map.put("G", 1);
//		map.put("A", 29);
//		map.put(null, 1000);
////		map.put(null,111);
////		map.put(null, null);
//		map.put("null", 234);
		
		//O(1)
//		map.remove("A");
//		map.remove("AA");
		
		//O(1)
		
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("AA"));
		
		TreeMap<String , Integer> map = new TreeMap<>();
		//O(logN)
		map.put("A", 10);
		map.put("B", 20);
		map.put("F", 100);
		map.put("C", 15);
		map.put("E", 34);
		map.put("G", 1);
		map.put("A", 29);
//		map.put(null, 1000);
//		map.put(null,111);
//		map.put(null, null);
		map.put("null", 234);
		
		//O(1)
		System.out.println(map.get("AAA"));
		

		

//		System.out.println(map);
		
		for (String s : map.keySet()) {
			System.out.println(s + "==>" + map.get(s));
		}
	}

}
