package Lecture36;

import Lecture36.LLReverseRecursive.ListNode;

public class IntersectionOfLL {
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

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode A = headA;
		ListNode B = headB;
		
		while(A!=B) {
			if(A == null) {
				A = headB;
			}
			else {
				A = A.next;
			}
			if(B == null) {
				B = headA;
			}
			else {
				B = B.next;
			}
		}
		
		return A;
	}

}
