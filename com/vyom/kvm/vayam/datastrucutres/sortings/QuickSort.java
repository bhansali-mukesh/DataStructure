package com.vyom.kvm.vayam.datastrucutres.sortings;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 4, 6, 16, 21, 3, 23, 12, 6, 8 };
		printArray(array);

		sort(array, 0, array.length - 1);
		printArray(array);
	}

	public static void sort(int[] array, int min, int max) {

		if (min < max) {

			int pivot = sortPivot(array, min, max);
			System.out.println("Pivot : array[" + pivot + "] = " + array[pivot]);
			System.out.println();
			
			sort(array, min, pivot-1);
			sort(array, pivot+1, max);
		}

	}

	private static int sortPivot(int[] array, int min, int max) {

		// Initial Index for Pivot Element
		int pivotIndex = min;
		int pivotElemnt = array[max];

		for (int i = min; i < max; i++) {

			// Shift Lighter Element Ahead to Pivot Index
			if (array[i] < pivotElemnt) {
				swap(array, pivotIndex, i);
				printArray(array);
				pivotIndex++;
			}
		}
		// Put Pivot Element in it's Right Position
		swap(array, max, pivotIndex);

		return pivotIndex;
	}

	private static void swap(int[] array, int i, int j) {

		System.out.println("Swaping : <" + array[i] + ", " + array[j] + ">");

		if (i != j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.println();
	}

}
