package com.vyom.kvm.vayam.datastrucutres.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTree(int data) {
		root = new Node(data);
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	public void postOrder(Node node) {

		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node + ",");
		}
	}

	public List<Node> descending() {

		List<Node> sortedList = descending(root, new ArrayList<Node>());

		for (Node node : sortedList) {
			System.out.print(node + ",");
		}

		return sortedList;
	}

	public List<Node> descending(Node node, List<Node> list) {

		if (node != null) {
			descending(node.getRight(), list);
			list.add(node);
			descending(node.getLeft(), list);
		}
		return list;
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node + ",");
			inOrder(node.getRight());
		}
	}

	public void preOrder(Node node) {

		if (node != null) {
			System.out.print(node.getData() + ",");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	private void add(int data, Node node) {

		Node parent = node;

		while (node != null) {

			parent = node;
			if (data < node.data) {
				node = node.getLeft();
			} else {
				node = node.getRight();
			}
		}

		if (data < parent.getData()) {
			parent.setLeft(new Node(data));
		} else {
			parent.setRight(new Node(data));
		}
	}

	public void add(int data) {

		if (root == null) {
			root = new Node(data);
		} else {
			add(data, root);
		}
	}

	public Node find(int data) {

		return find(root, data);
	}

	public Node find(Node node, int data) {

		while (node != null) {

			if (node.getData() == data)
				return node;

			if (data > node.getData()) {
				node = node.getRight();
			} else {
				node = node.getLeft();
			}
		}
		return null;
	}

	public Node delete(int data) {
		return delete(root, data);
	}

	public Node delete(Node node, int data) {

		Node parent = null;
		Node current = node;

		while (current != null) {

			if (current.getData() == data) {
				break;
			}

			parent = current;
			if (data < current.getData()) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}

		// Not Found
		if (current == null)
			return null;

		// If Not Root Node
		if (parent != null) {
			if (current.left == null) {
				if(current.data < parent.data) {
					parent.setLeft(current.right);
				} else {
					parent.setRight(current.right);
				}
			}
			if (current.right == null) {
				if(current.data < parent.data) {
					parent.setLeft(current.left);
				} else {
					parent.setRight(current.left);
				}
			}
			return current;
		}

		int successorValue = getSuccessorValue(current);
		delete(current, successorValue);
		current.setData(successorValue);

		return current;
	}

	private int getSuccessorValue(Node current) {

		if (current.getLeft() != null) {

			current = current.getLeft();

			while (current.getRight() != null) {
				current = current.getRight();
			}

		} else if (current.getRight() != null) {
			current = current.getRight();

			while (current.getLeft() != null) {
				current = current.getLeft();
			}
		}

		return current.getData();
	}
}
