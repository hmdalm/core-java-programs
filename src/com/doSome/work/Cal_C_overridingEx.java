package com.doSome.work;

public class Cal_C_overridingEx {
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	double sum(double a,double b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		Cal_C_overridingEx obj = new Cal_C_overridingEx();
		double ans=obj.sum(3.2,4.8);
		System.out.println(ans);
		int ans1 =obj.sum(10, 25);
		System.out.println(ans1);
		int ans2=obj.sum(25,25,25);
		System.out.println(ans2);
		

	}

}
