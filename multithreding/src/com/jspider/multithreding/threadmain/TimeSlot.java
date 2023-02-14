package com.jspider.multithreding.threadmain;

public class TimeSlot {
	public static void main(String[] args) {
		int A[]= {1,4,8,16,18};
		int B[]= {3,6,10,18,20};
		int C[]=new int[4];
		int D[]=new int[4];
		for(int i=0;i<=3;i++) {
			if(i !=4 && B[i]!=A[i+1]) {
				C[i]=B[i];
				D[i]=A[i+1];
				
			}
		}
		D[3]=24;
		for(int i=0;i<=2;i++) {
			System.out.print(C[i]+" ");	
		}	
		System.out.println(B[4]);
		for(int i=0;i<=2;i++) {
			System.out.print(D[i]+" ");	
		}
		System.out.println(D[3]);
		
	}

}
