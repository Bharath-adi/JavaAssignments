package com.te.javabasics.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(01, "Adi", 85.55, "Bangalore", 24));
		arrayList.add(new Student(02, "Bhargav", 40.35, "Hubli", 28));
		arrayList.add(new Student(03, "Karthik", 55.51, "Mysore", 26));
		arrayList.add(new Student(04, "Jaison", 75.53, "Mysuru", 24));
		arrayList.add(new Student(05, "Barath", 64.55, "Andhra Pradesh", 23));

		System.out.println("Welcome");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Press 1 to sort by RollNumber/ID . ");
			System.out.println("Press 2 to sort by Age. ");
			System.out.println("Press 3 to sort by Marks. ");
			System.out.println("Press 4 to sort by Name. ");
			System.out.println("Press 5 to sort by Address. ");
			int x = scanner.nextInt();

			switch (x) {
			case 1:
				Collections.sort(arrayList, new CompareByRollNo());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 2:
				Collections.sort(arrayList, new CompareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 3:
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 4:
				Collections.sort(arrayList, new CompareByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 5:
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			default:
				System.out.println("Please enter the correct key to continue . ");
				System.out.println(" ");
				continue;
			}
			Scanner sc = new Scanner(System.in);
			System.out.println();// for spacing in output
			System.out.println("Please type 'Y' if you want to continue.");
			System.out.println("Please type 'N' if you want to exit.");
			String str = sc.next();
			if (str.equalsIgnoreCase("Y")) {
				flag = true;
			} else if (str.equalsIgnoreCase("N")) {
				flag = false;
				System.out.println("Thank you.");
			}
		} while (flag);
	}
}
