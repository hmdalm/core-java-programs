package com.doSome.work;

public class TryCatchException { 
  
	public static void main(String[] args) {
		
		  try { int data=50/0;
		  
		  } // Note :- try to handle the ArithmeticException using
		  catch(ArithmeticException e) {
		  System.out.println(e); } System.out.println("rest of the code");
		 }  
      
}  


