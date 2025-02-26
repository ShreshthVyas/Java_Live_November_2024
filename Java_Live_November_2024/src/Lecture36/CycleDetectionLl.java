package Lecture36;

import Lecture36.MiddleOfLL.ListNode;

public class CycleDetectionLl {

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

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next; 
			if(slow == fast) { // Meet
				return true;
			}
		}
		
		return false;
	}

}
