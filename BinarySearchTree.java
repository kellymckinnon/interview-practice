public class BinarySearchTree {
	public Node {
		private Node left;
		private Node right;
		private int value;

		public Node(Node left, Node right, int value) {
			this.left = left;
			this.right = right;
			this.value = value;
		}

		public getLeft(){return left;}
		public getRight(){return right;}
		public getValue(){return value;}
	}

	/* Lookup is O(log2(n)), as half of the nodes are eliminated each time. 
	UNLESS the tree is unbalanced, then it is basically traversing a linked
	list so it is O(n). */
	Node findNode(Node root, int value) {
		while (root != null) {
			if (root.getValue() == value) //Found
				return root;
			else if root.getValue() < value) //Go right
				root = root.getRight();
			else root = root.getLeft(); //Go left
		}

		return null; //Not found
	}

	/* Print root, then left descendants, then right descendants 
	Runtime = O(n) since every node is examined once */
	void preOrderTraversal(Node root) {
		if (root == null) return;
		System.out.println(root.getValue());
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}

	/*  */
	void inOrderTraversal(Node root) {
		if (root == null) return;
		inOrderTraversal(root.getLeft());
		System.out.println(root.getValue());
		inOrderTraversal(root.getRight());
	}
	
	/* Print left descendants, then right descendants, then root */
	void postOrderTraversal(Node root) {
		if (root == null) return;
		inOrderTraversal(root.getLeft());
		inOrderTraversal(root.getRight());
		System.out.println(root.getValue());
	}

	//Can implement traversal iteratively using a stack
	void preOrderIterative(Node root) {
		Stack<Node> = new Stack<Node>(); //maybe not correct syntax
		stack.push(root);
		while(true) {
			Node curr = stack.pop();
			if(curr == null) break;
			System.out.println(curr);
			if(curr.getRight() != null)
				stack.push(curr.getRight());
			if(curr.getLeft() != null)
				stack.push(curr.getLeft());
		}
	}
}