package com.doSome.work;

public class Student11 {
	int id;
	String name;

	Student11(int i, String n) {
		id = i;
		name = n;

	}

	void display() {
		System.out.println(id + " " + name);
		
	}

	public static void main(String[] args) {
		
		Student11 s1 = new Student11(10, "ali");
		s1.display();
	}

}
