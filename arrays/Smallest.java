package com.te.javabasics.arrays;

public class Smallest {
	public static void main(String[] args) {
		int[] a = { 2,10, 2, 7, -1, -3 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];
			}

		}
			System.out.println("Smallest array is : " + max);
		
	}
}
