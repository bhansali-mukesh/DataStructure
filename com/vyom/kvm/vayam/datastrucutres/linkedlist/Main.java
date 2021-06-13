package com.vyom.kvm.vayam.datastrucutres.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList(78);
		
		list.addFront(14);
		list.addFront(65);
		
		//list.print();
		//System.out.println();
		
		list.addEnd(87);
		list.addEnd(2);
		
		list.print();
		System.out.println();
		
//		System.out.println(list.find(34));
//		System.out.println(list.find(87));
		
//		list.reverse();
//		list.print();
//		System.out.println();
		
//		System.out.println(list.nthLastElement(4));
//		System.out.println(list.nthLastElement(10));
//		
//		list.nthFromLast(4);
//		list.nthFromLast(1);
//		list.nthFromLast(0);
//		list.nthFromLast(10);
//		list.nthFromLast(5);
		
		list.sort();
		list.print();
		System.out.println();
		
	}

}
