package com.doSome.work;

public class TestROI {

	public static void main(String[] args) {
    Banks b = new Sbi();
    System.out.println("SBI Bank");

System.out.println("ROI : "+b.rateofInterest());

Banks b1 = new Pnb();
System.out.println("PNB Bank");
System.out.println("ROI : "+b1.rateofInterest());
Banks b2 = new Hdfc();
System.out.println("HDFC Bank");
System.out.println("ROI : "+b2.rateofInterest());
	}

}
