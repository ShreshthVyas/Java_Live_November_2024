package Lecture46;

import java.util.ArrayList;

public class Hashmap<K,V> {
	
	public class Node{
		K key;
		V value;
		Node next;
	}
	
	private ArrayList<Node> bckt;
	private int size = 0;
	
	public Hashmap() {
		bckt = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			bckt.add(null);
		}
	}
	public Hashmap(int n) {
		bckt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K key, V value) {
		int idx = hashFunc(key);
		Node curr = bckt.get(idx);
		
		// case 1 Key Already present 
		while(curr!=null) {
			if(curr.key.equals(key)) { // Key already present
				curr.value = value;//value replaced
				return;
			}
			curr = curr.next;
		}
		
		// case key not present
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		nn.next = bckt.get(idx);
		
		bckt.set(idx, nn);
		this.size++;
		
		double lf = this.size / this.bckt.size();
		double thf = 2.0;
		
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> temp = new ArrayList<>();
		
		for (int i = 0; i < 2* this.bckt.size(); i++) {
			temp.add(null);
		}
		
		ArrayList<Node> ll = this.bckt;
		this.bckt = temp;
		
		for (Node head : bckt) { // traverse on arraylist
			while(head!=null) {
				put(head.key,head.value);
				head = head.next;
			}
		}
		
		
	}
	public V remove(K key) {
		int idx = hashFunc(key);
		Node curr =  bckt.get(idx);
		Node prev = null;
		while(curr!=null) {
			if(curr.key.equals(key)) { // Key already present
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		
		if(curr == null) {// key not found
			return null;
		}
		if(prev == null) { // delete first element
			bckt.set(idx, curr.next);
			curr.next = null;
			
		}
		else {
			prev.next = curr.next;
			curr.next = null;
		}
		this.size--;
		return curr.value;
	}
	
	public V get(K key) {
		int idx = hashFunc(key);
		Node curr =  bckt.get(idx);
		
		while(curr!=null) {
			if(curr.key.equals(key)) { // Key already present
				return curr.value;
			}
			curr = curr.next;
		}
		
		return null;
	}
	
	public boolean containsKey(K key) {
		int idx = hashFunc(key);
		Node curr =  bckt.get(idx);
		
		while(curr!=null) {
			if(curr.key.equals(key)) { // Key already present
				return true;
			}
			curr = curr.next;
		}
		
		return false;
	}
	
	private int hashFunc(K key) {
		int idx = key.hashCode() % this.bckt.size();
		
		if(idx<0) {
			idx = idx+ this.bckt.size();
		}
		
		return idx;
	}
	
	@Override
	public String toString() {
		String s = "{ ";
		
		for (Node head : bckt) { // traverse on arraylist
			while(head!=null) {
				s+= head.key + "=>" + head.value +" ,";
				head = head.next;
			}
		}
		
		s+= "} ";
		return s;
		
	}
	
	
	
}
