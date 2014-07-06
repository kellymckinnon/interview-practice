/* PROBLEM: Find the nth to last element of singly linked list */

public class FindNthToLastElement {
	public class Node {
		String data;		Node next;
	}

	public static Node find(Node head, int n) {
		if (n < 1 || head == null) return null;

		Node lead = head;
		Node follower = lead;

		// Put lead pointer n spots in front of follower		
		for (int i = 0; i < n-1; i++) {
			//List size < n
			if(lead == null) return null;

			lead = lead.next;
		}

		/* Move pointers simultaneously such that the
		follower will reach the nth to last element when
		the lead reaches the end of the list */
		while (lead.next != null) {
			lead = lead.next;
			follower = follower.next;
		}

		return follower;
	}
	
}