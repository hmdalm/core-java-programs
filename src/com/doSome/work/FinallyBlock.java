package com.doSome.work;

public class FinallyBlock {
	void finally_1() {
		 try{    
			//below code do not throw any exception  
			   int data=25/5;    
			   System.out.println(data);    
			  }    
			//catch won't be executed  
			  catch(NullPointerException e){  
			System.out.println(e);  
			}    
			//executed regardless of exception occurred or not  
			 finally {  
			System.out.println("finally block is always executed");  
			}    
			    
			System.out.println("rest of phe code...");    
			  }    
		
	
void finally_2() {try {    
	  
    System.out.println("Inside the try block");  
      
    //below code throws divide by zero exception  
   int data=25/0;    
   System.out.println(data);    
  }    
  //cannot handle Arithmetic type exception  
  //can only accept Null Pointer type exception  
  catch(NullPointerException e){  
    System.out.println(e);  
  }   

  //executes regardless of exception occured or not   
  finally {  
    System.out.println("finally block is always executed");  
  }    

  System.out.println("rest of the code...");    
  }        
		
	
void finally_3() {
	try {    
		  
        System.out.println("Inside try block");  
  
        //below code throws divide by zero exception  
       int data=25/0;    
       System.out.println(data);    
      }   
  
      //handles the Arithmetic Exception / Divide by zero exception  
      catch(ArithmeticException e){  
        System.out.println("Exception handled");  
        System.out.println(e);  
      }   
  
      //executes regardless of exception occured or not   
      finally {  
        System.out.println("finally block is always executed");  
      }    
  
      System.out.println("rest of the code...");    
      }   


	public static void main(String[] args) {
FinallyBlock obj = new FinallyBlock();

obj.finally_1(); // in finally_1 catch block wont be executed bcoz try block not have any execption but finally always executed;
obj.finally_2();//in finally_2 there is a Arithmetic exception but no catch block is available in this methid to handle this so that it will be skiped due to finally and finally block will executed 
obj.finally_3();
	}

}
