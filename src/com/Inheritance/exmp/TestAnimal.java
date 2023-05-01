package com.Inheritance.exmp;

public class TestAnimal {
	public static void main(String[] args) {
	
	Animal a1 = new Animal();
	a1.eat();
	Cat a2 = new Cat();
	a2.sound();
	a2.eat();
	Cat a3 = new CatBaby();
	a3.eat();
	a3.sound();
	CatBaby a4 = new CatBaby();
	a4.cry();
	a4.eat();
	a4.sound();

}
}