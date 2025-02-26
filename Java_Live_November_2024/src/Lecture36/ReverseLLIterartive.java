package Lecture36;

import java.util.Stack;

import Lecture36.ReverseLLUsingStack.ListNode;

public class ReverseLLIterartive {

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
		if(head == null){
            return null;
        }
		
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next = prev; // connection reversed
			prev = curr;
			curr = temp;
		}
		return prev;
	}
}
