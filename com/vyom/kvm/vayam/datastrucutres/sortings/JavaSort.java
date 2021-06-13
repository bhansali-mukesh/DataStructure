package com.vyom.kvm.vayam.datastrucutres.sortings;

import java.util.Arrays;

public class JavaSort {

	public static void main(String[] args) {
	
		int[] array = {4, 6, 16, 21, 3, 23, 12, 6, 8, 81};
		printArray(array);
		
		Arrays.sort(array);
		System.out.println("Sorted Array");
		printArray(array);
		printArray(Arrays.copyOfRange(array, 3, 7));

	}

	private static void printArray(int[] array) {
		for(int element : array) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

}
