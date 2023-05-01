package com.doSome.work;

public class MultipleCatch2 {  
	  public static void main(String args[]){    
		   try{    
		    int a[]=new int[5];    
		    a[5]=30/0;  //it will throw arithmatic exception but it will be handled by Exception as in catch block it is the first one it must be used at last for avoiding the compile time error  
		   }    
		   catch(Exception e){System.out.println("common task completed");}    
			/*
			 * catch(ArithmeticException e){System.out.println("task1 is completed");}
			 * catch(ArrayIndexOutOfBoundsException
			 * e){System.out.println("task 2 completed");}
			 * System.out.println("rest of the code..."); }
			 */
		   //Note :- remove commented block for better understanding
		   
		}   

}
