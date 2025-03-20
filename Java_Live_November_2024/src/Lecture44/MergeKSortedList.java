package Lecture44;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		
		for (ListNode node : lists) {
			if(node!=null) {
				pq.add(node);
			}
		}
		
		ListNode DummyHead = new ListNode();
		ListNode temp = DummyHead;
		
		while(!pq.isEmpty()) {
			ListNode nn = pq.remove();
			temp.next = nn;
			temp = temp.next;
			if(nn.next!=null) { // End Check
				pq.add(nn.next);
			}
		}
		
		return DummyHead.next;
		
	}

}
