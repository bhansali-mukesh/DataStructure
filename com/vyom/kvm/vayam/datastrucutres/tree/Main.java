package com.vyom.kvm.vayam.datastrucutres.tree;

public class Main {

	public static void main(String[] args) {
	
		BinarySearchTree tree = new BinarySearchTree(34);
		
		tree.add(23);
		tree.add(43);
		tree.add(90);
		tree.add(80);
		tree.add(85);
		tree.add(12);
		tree.add(25);
		
//		tree.preOrder();
//		
//		tree.inOrder();
		
//		tree.postOrder();

//		tree.descending();
		
//		System.out.println(tree.find(42));
//		System.out.println(tree.find(80));
//		System.out.println(tree.find(13));
		
		tree.inOrder();
		
		tree.delete(80);
		tree.inOrder();
		
		tree.delete(46);
		tree.inOrder();
		
		tree.delete(34);
		tree.inOrder();
		
		tree.delete(80);
		tree.inOrder();
		
		tree.delete(23);
		tree.inOrder();
		
		tree.delete(12);
		tree.inOrder();
	}

}
