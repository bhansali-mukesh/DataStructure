package com.vyom.kvm.vayam.datastrucutres.linkedlist;

public class LinkedList {

	private Node start;

	public LinkedList() {
		start = null;
	}

	public LinkedList(int data) {
		start = new Node(data);
	}

	public void addFront(int data) {
		start = new Node(data, start);
	}

	public void addEnd(int data) {

		if (start == null) {
			start = new Node(data);
			return;
		}

		Node current = start;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(new Node(data));
	}

	public Node find(int data) {

		Node current = start;

		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}

	public void reverse() {

		Node parent = null;
		Node current = start;
		Node next = null;

		while (current != null) {

			next = current.next;

			current.next = parent;
			parent = current;

			current = next;
		}
		start = parent;
	}

	public Node nthLastElement(int nthFromLast) {

		Node current = start;
		int total = 0;

		while (current != null) {
			total++;
			current = current.getNext();
		}

		int nthFromStart = total - nthFromLast + 1;

		current = start;

		int count = 0;
		while (current != null) {
			count++;
			if (count == nthFromStart) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}

	public void nthFromLast(int nthFromLast) {
		nthLastElementRecursive(nthFromLast, start, 0);
	}

	public int nthLastElementRecursive(int nthFromLast, Node node, int number) {

		if (node == null) {
			int nthFromStart = number - nthFromLast;
			System.out.println(nthFromStart);
			if (nthFromStart >= number || nthFromStart < 0) {
				System.out.println("Wrong Input");
			}
			return nthFromStart;
		}

		int nthFromStart = nthLastElementRecursive(nthFromLast, node.next, number + 1);

		if (nthFromStart == number)
			System.out.println(" nthLastElementRecursive : " + node);

		return nthFromStart;
	}

	public void print() {

		Node current = start;

		while (current != null) {
			System.out.print(current + ", ");
			current = current.getNext();
		}
	}

}