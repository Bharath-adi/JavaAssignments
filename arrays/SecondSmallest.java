package com.te.javabasics.arrays;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] a1 = { 2, 3, 4, 4, 77, 90, 95, 95, 95, 28, 100 };
		int temp;
		
		// for sorting of given array in different order;
		for (int i = 0; i < a1.length - 1; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[j] < a1[i]) {                  // '>' for descending , '<' for ascending order;
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1) + "is the sorted array");
		System.out.println("---------------------------------------");
		
		// to find second smallest number when smallest number is repeated ;
		for (int e = a1.length - 2; e >= 0; e--) {
			if (a1[e - 1] != a1[e]) {
				System.out.println(a1[e] + "is the second largest");
				break;
			}
		}
	}
}
