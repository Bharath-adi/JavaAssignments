package com.te.javabasics.arrays;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		Object[] arr = { 1, 2, 3, 4 };
		Object[] temp = new Object[4];

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println("-----------------------------");

		// to copy arr to temp
		// 1
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		System.out.println("Temp:" + Arrays.toString(temp));
		// 2 using arraycopy method
		System.arraycopy(arr, 0, temp, 2, 3); // [0]-index ,[2]-to which index to start printing/copy ,3-how many you
												// want to copy from arr to temp
		System.out.println("Temp:" + Arrays.toString(temp));

		// Iterating an array [to get output in line by line or step by step]
		// 1
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
 
		}
		System.out.println("------------------------------");
		// 2
		for (Object object : arr) {
			System.out.println(object);
		}
	}
}
