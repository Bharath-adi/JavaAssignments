package com.te.javabasics.arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 4, 7, 7, 7, 7, 8, 9 };
		for (int j = 0; j < a.length; j++) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[j] && i != j) {
					count++;
					a[i] = '\n';
				}
			}
			if (a[j] != '\n' && count > 0) {
				System.out.println("Duplicate elements are :" + a[j] + " ");
			}
		}
	}
}


//why all methods in array are static ?
//why is array fixed in size?