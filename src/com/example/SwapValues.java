package com.example;

public class SwapValues {

	 public static void main(String args[])   
	    {   
	        int a = 10;  
	        int b = 12;
	        System.out.println("before swapping numbers: "+a +" "+ b);  
	       /*Swapping*/  
	        a = a + b;   
	        b = a - b;   
	        a = a - b;   
	        System.out.println("After swapping: "+a +"  " + b);   
	    }   
}
