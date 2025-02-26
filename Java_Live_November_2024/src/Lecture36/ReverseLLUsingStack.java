package Lecture36;

import java.util.Stack;

import Lecture36.MiddleOfLL.ListNode;

public class ReverseLLUsingStack {

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
		Stack<ListNode>  st = new Stack<>();
		
		ListNode temp = head;
		
		while(temp!=null) {
			st.push(temp);
			temp = temp.next;
		}
		
		head = st.pop();
		temp = head;
		
		while(!st.isEmpty()) {
			temp.next = st.pop();
			temp = temp.next;
		}
		temp.next = null;
		return head;
		
	}
}
