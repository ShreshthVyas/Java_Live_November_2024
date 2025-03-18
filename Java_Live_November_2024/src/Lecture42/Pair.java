package Lecture42;

public class Pair <K,V> {
	K key;
	V val;
	
	public Pair() {
		
	}
	public Pair(K key, V value) {
		this.key = key;
		this.val = value;
	}
	
	public void Display() {
		System.out.println(this.key + " ==> "+ this.val);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,Integer> p = new Pair<>(10,20);
		p.Display();
		Pair<Integer,String> p1 = new Pair<>(20,"Hello");
		p1.Display();
//		Pair<Boolean,Integer> p2 = new Pair<>();
//		Pair<Double,Long> p3 = new Pair<>();
		
	}

}
