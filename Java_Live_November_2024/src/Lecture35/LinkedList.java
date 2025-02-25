package Lecture35;

public class LinkedList {

	public class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// O(1)
	public void Addfirst(int item) {
		if (this.size == 0) {
			Node nn = new Node();
			nn.val = item;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = item;
			nn.next = this.head;
			this.head = nn;
		}
		this.size++;
	}

	// O(1)
	public void AddLast(int item) {
		if (this.size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void Display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.val + "==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void removeLast() {
		Node temp = this.head;

		while (temp.next != this.tail) {
			temp = temp.next;
		}
//		int i = this.tail.val;
		temp.next = null; // second last node ka next is null
		this.tail = temp;
		this.size--;

	}

	public void removefirst() {
		this.head = this.head.next;
		this.size--;
	}

	public void addatIdx(int item, int idx) {
		Node temp = this.head;
		int count = 1;

		while (count < idx) {
			temp = temp.next;
			count++;
		}

		Node nn = new Node();
		nn.val = item;
		nn.next = temp.next;

		temp.next = nn;
		this.size++;
	}

	public void removeatIdx(int idx) {
		Node temp = this.head;
		int count = 1;

		while (count < idx) {
			temp = temp.next;
			count++;
		}

		temp.next = temp.next.next;
		this.size--;
	}

	public int getAtIdx(int idx) {
		Node temp = this.head;
		int count = 0;

		while (count < idx) {
			temp = temp.next;
			count++;
		}

		return temp.val;
	}

	public boolean linearsearch(int item) {
		Node temp = this.head;

		while (temp != null) {
			if(temp.val == item) {
				return true;
			}
			temp = temp.next;
		}
		
		return false;
	}

}
