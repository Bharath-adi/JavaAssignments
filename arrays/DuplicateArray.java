package com.te.javabasics.arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// initializing array
		int[] arr = new int[] { 1, 2,2, 2, 3, 4, 7, 8, 8, 3 };
		System.out.println("Duplicate elements given in a array:");
		// logic to search duplicate array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[j] + "  ");
			}
		}
	}
}
