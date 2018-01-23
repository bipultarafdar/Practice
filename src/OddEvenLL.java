
public class OddEvenLL {

	public static ListNode oddEvenList(ListNode head) {
        ListNode oddHead = head;
        ListNode oddTail = oddHead;
        ListNode evenHead = head.next;
        ListNode evenTail;
        ListNode temp = head;
        while(temp != null) {
            oddTail = temp;
            temp = temp.next;
            evenTail = temp;
            if(temp != null) temp = temp.next;
        }
        oddTail.next = evenHead;
        return oddHead;
    }
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		l = oddEvenList(l);
		while(l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}
	
}
