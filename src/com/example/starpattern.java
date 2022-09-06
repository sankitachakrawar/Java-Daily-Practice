package com.example;

public class starpattern {

	public static void main(String[] args) {
	
		int rows=4;
		for (int i = rows; i >= 1; i--)  
		{  
		for (int j = rows; j >= i; j--)  
		{  
		System.out.print(j+" ");  
		}  
		   
		System.out.println();  
		}  
		
		
	}
	}
