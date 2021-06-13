package com.vyom.kvm.vayam.datastrucutres.sortings;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 4, 6, 16, 21, 3, 23, 12, 6, 8 };
		printArray(array);

		sort(array);
		printArray(array);
	}

	public static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			//System.out.println("Pass " + i);
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}

	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

	private static void swap(int[] array, int i, int j) {

		//System.out.println("Swaping : <" + array[i] + ", " + array[j] + ">");

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
