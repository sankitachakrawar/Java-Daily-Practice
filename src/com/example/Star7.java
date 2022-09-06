package com.example;

public class Star7 {

	public static void main(String[] args) {
		
		int n=7,i,j,number;
		
		for(i=0;i<n;i++) {
			number=1;
			for(j=0;j<=i;j++) {
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}
		
	}
}
