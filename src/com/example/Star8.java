package com.example;

public class Star8 {

	public static void main(String[] args) {
		
		int i,j,k=1;
		for(i=0;i<=7;i++) {
			for(j = 1; j< i + 1; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
	}
}
