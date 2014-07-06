/* PROBLEM: Remove duplicates from an unsorted linked list. 
Solve this with and without a temporary buffer.*/
import java.util.*;

public class RemoveLinkedListDuplicates {
	public class Node {
		public String data;
		public Node next;
	}

	// Use set to track elements and remove pointers to duplicates
	public static void withBuffer(Node n) {
		HashSet<String> list = new HashSet<String>();
		Node prev = n;
		while(n != null) {
			if (list.contains(n.data))
				prev.next = n.next; 
			else {
				list.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}

	// Use two pointers: one iterates normally, the other iterates
	// through prior nodes to find duplicates
	public static void withoutBuffer(Node n) {
		if (n == null) return;
		Node prev = n;
		Node curr = n.next; 
		while (curr != null) {
			Node checker = n;
			while (checker != curr) {
				if (checker.data == curr.data) {
					Node temp = curr.next;
					prev.next = temp;
					curr = temp;
				}
				checker = checker.next;
			}

		if (checker == curr) {
			prev = curr;
			curr = curr.next;
		}
		}
	}
}