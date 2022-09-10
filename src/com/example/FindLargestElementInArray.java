package com.example;

public class FindLargestElementInArray {

	public static void main(String[] args) {
	
		int arr[] = {12, 35, 1, 10, 34, 1};

	int i;
    
   int max = arr[0];
    
   for (i = 1; i < arr.length; i++) {
       if (arr[i] > max)
           max = arr[i];
   
   }
   System.out.println("Largest in given array is :" +max);
	}
	
}

