package com.example;

public class Star2 {

	public static void main(String[] args) {
		
		int row=6;
		for(int i=0;i<row;i++) {
			for(int j=2*(row-i);j>=0;j--) {
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		
	}
}
