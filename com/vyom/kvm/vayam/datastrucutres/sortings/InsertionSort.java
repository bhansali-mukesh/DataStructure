package com.vyom.kvm.vayam.datastrucutres.sortings;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = { 14, 6, 16, 21, 3, 23, 12, 6, 8 };
		printArray(array);

		sort(array);
		printArray(array);
	}

	public static void sort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			//System.out.println("Pass " + i);
			int current = array[i];
			int lower=i-1;
			while(lower >= 0 && current<array[lower]) {
				//System.out.println(array[lower] + "><" + current);
				array[lower + 1] = array[lower];
				lower--;
			}
			array[lower+1] = current;
			//printArray(array);
			
		}
	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

}
