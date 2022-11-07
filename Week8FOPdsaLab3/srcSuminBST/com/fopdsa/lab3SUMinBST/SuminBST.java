package com.fopdsa.lab3SUMinBST;

import java.util.HashSet;

public class SuminBST {
	Node root;

	public SuminBST(Node root) {
		this.root = root;
	}

	public static void isSum(int sum, Node root) {
		HashSet<Integer> set = new HashSet<>();
		isSum(set, root, sum);
	}

	public static boolean isSum(HashSet<Integer> set, Node root, int SUM) {
		if (root == null) {
			return false;
		}
		if (isSum(set, root.left, SUM)) {
			return true;
		}
		if (set.contains(SUM - root.data)) {
			System.out.println("Pair is there between " + root.data + " and " + (SUM - root.data));
			return true;
		} else {
			set.add(root.data);

		}
		return isSum(set, root.right, SUM);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		SuminBST binaryTree = new SuminBST(root);
		binaryTree.root.left = new Node(20);
		binaryTree.root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		isSum(130, root); // Check the Sum
	}
}

class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}
