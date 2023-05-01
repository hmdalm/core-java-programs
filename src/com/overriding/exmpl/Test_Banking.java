package com.overriding.exmpl;

public class Test_Banking {
	void whileEx() {
		int ar[]= {10,5,8,4,12,13};
		int start=0;
		int end=ar.length-1;
		while(start<end) {
			int tem= ar[start]+ar[end];
			ar[start]=tem-ar[start];
			ar[end] = tem-ar[end];
			
			start++;
			end--;}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		
		}
		
	}

	public static void main(String[] args) {
		Test_Banking ob = new Test_Banking();
		ob.whileEx();
		SbiBank sbi = new SbiBank();
		System.out.println("Rate of Interest of sbi: " + sbi.rateOfInterest());
		AxisBank ax = new AxisBank();
		System.out.println("Rate of Interest of Axis: " + ax.rateOfInterest());
		PnbBank pnb = new PnbBank();
		System.out.println("Rate of Interest of pnb: " + pnb.rateOfInterest());
	
	}
}
