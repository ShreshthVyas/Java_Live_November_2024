package Lecture37;

import Lecture36.CycleDetectionLl.ListNode;

public class MergeTwoSortedLists {

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
		
		while(a!=null && b!=null) {
			if(a.val<b.val) {
				temp.next = a;
				a =a.next;
			}
			else {
				temp.next = b;
				b =b.next;
			}
			temp = temp.next;
		}
		
		if(a == null) {
			temp.next = b;
		}
		if(b == null) {
			temp.next = a;
		}
		
		return dummyhead.next;
		
	}
}
