package Lecture45;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> set = new HashSet<>();
		//O(1)
//		set.add(1);
//		set.add(3);
//		set.add(2);
//		set.add(4);
//		set.add(null);
//		
//		//O(1)
//		set.remove(1);
//		
//		//O(1)
//		System.out.println(set.contains(2));
//		System.out.println(set.contains(1));
//		
//		System.out.println(set);
		
		//LinkedHashSet<Integer> set = new LinkedHashSet<>();
		//O(1)
//		set.add(1);
//		set.add(3);
//		set.add(2);
//		set.add(4);
//		set.add(null);
//		
//		//O(1)
//		set.remove(1);
//		
//		//O(1)
//		System.out.println(set.contains(2));
//		System.out.println(set.contains(1));
//		
//		System.out.println(set);
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(4);
//		set.add(null);
		
		//O(1)
		set.remove(1);
		
		//O(1)
		System.out.println(set.contains(2));
		System.out.println(set.contains(1));
		
		System.out.println(set);
		
		for (int i : set) {
			System.out.println(i);
		}
	}

}
