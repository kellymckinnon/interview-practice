public class ReverseList {
	public class Node {
		String data;
		Node next;

		public Node(String data);
	}

	public Node reverseList(Node head) {
		if (head == null) { //Empty list; cannot reverse
			throw new IllegalArgumentException("List cannot be empty");
		}
		else if (head.next == null) { //Only one node so tail = head
			return head;
		}

		Node middle = head;
		Node back = null;
		Node front = head;

		while(middle != null) {
			front = middle.next;
			middle.next = back;
			back = middle;
			middle = front; 
		}

		return front;
	}

	public static void main(String[] args) {
		Node one = new Node("one");
		Node two = new Node("two");
		Node three = new Node("three");
		

	}

}