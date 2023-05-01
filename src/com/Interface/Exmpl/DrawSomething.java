package com.Interface.Exmpl;

 interface DrawSomething {
	void draw();
	

}
 class Rectangle implements DrawSomething {
	 public void draw() {
		 System.out.println("Draw a []");
	 }
	 
 }
 class Circle implements DrawSomething{
	 public void draw() {
		 System.out.println("Draw a O");
	 }
 }
 
