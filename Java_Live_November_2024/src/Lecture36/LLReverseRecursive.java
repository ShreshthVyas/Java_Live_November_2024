package Lecture36;

import Lecture36.ReverseLLIterartive.ListNode;

public class LLReverseRecursive {
	
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

	public ListNode reverseList(ListNode head) {
		return reverse(null,head);
	}

	private ListNode reverse(ListNode prev, ListNode curr) {
		// TODO Auto-generated method stub
		if(curr==null) {
			return prev;
		}
		
		ListNode temp = reverse(curr, curr.next);
		curr.next = prev; // Link reverse
		return temp;
	}
}
