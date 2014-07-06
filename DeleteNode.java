/* PROBLEM: Delete a node in the middle of a single linked list
given only access to that node. Note that this does NOT work if
the node is the last one in the list. */

public class DeleteNode {
	public class Node {
		String data;
		Node next;
	}

	/* Copy the data from n.next into n, then
	delete n.next */
	public static void remove(Node n) {
		if (n.next == null || n == null) {
			throw new IllegalArgumentException("Node cannot be null or at the end of the list.");
		}

		n.data = n.next.data;
		n.next = n.next.next;
	}
}