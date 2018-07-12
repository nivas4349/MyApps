package com.siva.tree;

public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inorderTraverseBinaryTree(Node focusNode) {
		if (focusNode != null) {
			inorderTraverseBinaryTree(focusNode.leftChild);
			System.out.println(focusNode);
			inorderTraverseBinaryTree(focusNode.rightChild);
		}
	}

	public void preorderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}

	public void postorderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			postorderTraverseTree(focusNode.leftChild);
			postorderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}

	public Node findNode(int key) {
		Node focusNode = root;
		while (focusNode.key != key) {
			if (key < focusNode.key)
				focusNode = focusNode.leftChild;
			else
				focusNode = focusNode.rightChild;
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	public Node getRoot() {
		return this.root;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(50, "I'm 50");
		bt.addNode(35, "I'm 35");
		bt.addNode(70, "I'm 70");
		bt.addNode(65, "I'm 65");
		bt.addNode(60, "I'm 60");
		bt.addNode(150, "I'm 150");
		bt.addNode(15, "I'm 15");
		bt.addNode(25, "I'm 25");

		// bt.inorderTraverseBinaryTree(bt.root);
		// bt.preorderTraverseTree(bt.root);
		// bt.postorderTraverseTree(bt.root);

		System.out.println(bt.findNode(157));
		System.out.println(bt.findNode(150));
	}

	public class Node {
		int key;
		String name;

		Node leftChild;
		Node rightChild;

		Node(int key, String name) {
			this.key = key;
			this.name = name;
		}

		public int getKey() {
			return this.key;
		}

		public String toString() {
			return name + " has a key : " + key;
		}
	}
}