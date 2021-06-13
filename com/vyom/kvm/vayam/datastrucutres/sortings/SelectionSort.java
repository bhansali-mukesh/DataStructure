package com.vyom.kvm.vayam.datastrucutres.sortings;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 4, 6, 16, 21, 3, 23, 12, 6, 8 };
		printArray(array);

		sort(array);
		printArray(array);
	}

	public static void sort(int[] array) {

		int min_index;
		for (int i = 0; i < array.length-1; i++) {
			System.out.println("Pass " + i);
			min_index = i;
			for (int j = i+1; j < array.length; j++) {

				if (array[min_index] > array[j]) {
					min_index = j;
				}
			}
			swap(array, min_index, i);
			printArray(array);
		}

	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

	private static void swap(int[] array, int i, int j) {

		System.out.println("Swaping : <" + array[i] + ", " + array[j] + ">");

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
