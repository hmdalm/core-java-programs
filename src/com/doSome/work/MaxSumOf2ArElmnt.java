package com.doSome.work;

public class MaxSumOf2ArElmnt {
	public static void main(String[] args) {
		int ar[]= {12,4,6,10,2,9,13,1,7};
		int maxm=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i;j<ar.length-1;j++) {
				if(maxm<(ar[i]+ar[j+1])) {
					maxm=ar[i]+ar[j+1];
				}
			}
		}
		System.out.println(maxm);
	}

}
