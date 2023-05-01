package com.doSome.work;

public class Animal1 {
	String colour;
	int weight;
	int length;
	public String toString() {
		String s="colour is "+colour;
		return s;
	}
public static void main(String[] args) {
	Animal1 a1 = new Animal1();
	System.out.println(a1);
}
}
