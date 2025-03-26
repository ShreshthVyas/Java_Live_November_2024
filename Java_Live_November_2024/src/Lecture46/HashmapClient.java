package Lecture46;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String,Integer> map = new Hashmap<>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);
		map.put("E", 34);
		map.put("F", 100);
		map.put("G", 1);
		map.put("A", 29);
		
		System.out.println(map);
		map.remove("A");
		map.remove("AA");
		
		System.out.println(map.get("B"));
		
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("B"));
		
		System.out.println(map);

	}

}
