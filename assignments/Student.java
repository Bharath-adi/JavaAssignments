package com.te.javabasics.assignments;

public class Student implements Comparable<Student> {
	int rollno;
	int age;
	double marks;
	String name;
	String address;

	public Student(int rollno, String name, double marks, String address, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
		return this.rollno;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", marks=" + marks + ", name=" + name + ", address="
				+ address + "]";
	}

}
