package com.doSome.work;

public class Validation_Throw_Exmp {

	public static void main(String[] args) {
		Validation_Throw_Exmp obj = new Validation_Throw_Exmp();
		obj.validate(105);
		System.out.println("Rest of the code");
		

	}
	void validate(int age) {
		if(age<18) {
			 throw new ArithmeticException("Person is not Eligible for vote");
			 //if the above condition not matched it will throw an exception
		}
		else {
			System.out.println("Person is Eligible for vote");
		}
	}

}
