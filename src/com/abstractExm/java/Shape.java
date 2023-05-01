package com.abstractExm.java;

abstract class Shape {

	abstract void draw();
	void dosomething() {
		System.out.println("hello java");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

