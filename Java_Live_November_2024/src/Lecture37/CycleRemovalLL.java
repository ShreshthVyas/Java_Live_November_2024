package Lecture37;

public class CycleRemovalLL {

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

	public Node getAtIdx(int idx) {
		Node temp = this.head;
		int count = 0;

		while (count < idx) {
			temp = temp.next;
			count++;
		}

		return temp;
	}

	public void CreateCycle(int idx) {
		Node temp = getAtIdx(idx);
		this.tail.next = temp;
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) { // Meet
				return slow;
			}
		}

		return null;
	}

	// O(N^2)
	public void RemoveCycle() {
		Node mp = hasCycle();

		if (mp == null) { // no cycle present
			return;
		}

		Node temp = this.head;

		while (temp != null) { // move temp fwd each time
			Node p = mp;
			while (p.next != mp) {
				if (p.next == temp) { // starting point found
					p.next = null;
					return;
				}
				p = p.next;
			}
			temp = temp.next;
		}

	}
	//O(N)
	public void CycleRemovalOptimised() {
		Node mp = hasCycle();

		if (mp == null) { // no cycle present
			return;
		}
		
		Node p = mp;
		int count = 1;
		while(p.next != mp ) { // finding length of cyclic part
			count++;
			p = p.next;
		}
		Node f = head;
		Node s = head;
		// Move f c times
		for (int i = 0; i < count; i++) {
			f = f.next;
		}
		
		// Move s and f simultaneously
		while(s.next!=f.next) {
			s = s.next;
			f = f.next;
		}
		
		f.next = null;
		
	}
	
	//O(N)
	public void FloydAlgo() {
		Node mp = hasCycle();

		if (mp == null) { // no cycle present
			return;
		}
		Node f = mp;
		Node s = head;
		
		while(s.next!=f.next) {
			s = s.next;
			f = f.next;
		}
		
		f.next = null;
	}
}
