package Lecture37;

import Lecture37.MergeTwoSortedLists.ListNode;

public class MergeSortLL {

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

	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode dummyhead = new ListNode();
		ListNode temp = dummyhead;

		while (a != null && b != null) {
			if (a.val < b.val) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}

		if (a == null) {
			temp.next = b;
		}
		if (b == null) {
			temp.next = a;
		}

		return dummyhead.next;

	}

	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next; // move fast with speed twice
		}

		return slow;
	}

	public ListNode sortList(ListNode head) {
		if(head == null || head.next==null) { // single node
			return head;
		}
		ListNode mid = middleNode(head);
		ListNode sh = mid.next;
		mid.next = null;
		ListNode a = sortList(head);
		ListNode b = sortList(sh);
		
		return mergeTwoLists(a, b);
		
	}

}
