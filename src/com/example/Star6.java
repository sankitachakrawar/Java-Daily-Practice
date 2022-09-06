package com.example;

public class Star6 {

	public static void main(String[] args) {
		
		int rows=4;
		int number = 1;
	
		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j > i; j--) {
				System.out.print("* ");
			
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(number + " ");
				number++;
			}

			System.out.println();
		}
	
	}
}
