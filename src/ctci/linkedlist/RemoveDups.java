package ctci.linkedlist;

import java.util.*;

public class RemoveDups {
	
	public static void remDups(ListNode head) {
		Set<Integer> set = new HashSet<Integer>();
		ListNode prev = null;
		while(head != null) {
			if(set.contains(head.val)) {
				prev.next = head.next;
			} else {
				set.add(head.val);
				prev = head;
			}
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, null)));
		remDups(head);
		System.out.println(head.val);
	}
}
