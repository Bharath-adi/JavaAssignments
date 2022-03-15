package com.te.javabasics.patternprograms;

public class AlphabetsPattern {
	public static void main(String[] args) {
		char ch = 'A';
		int row = 4;
		for (int i = 0; i < row; i++) {
			char temp = ch;
			for (int j = 0; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
			ch++;
		}
	}
}
