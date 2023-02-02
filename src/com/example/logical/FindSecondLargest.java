/*1. WAP to find Second largest element in an array : arr[] = [12, 35, 1, 10, 34, 1, 35], 
without sorting, without using any built-in methods and without deleting duplicate elements. What will be the time complexity?*/

package com.example.logical;

public class FindSecondLargest {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		int i, first, second; 

		if (n < 2) { 
			System.out.print(" Invalid Input "); 
			return; 
		} 

		first = second = Integer.MIN_VALUE; 
		for (i = 0; i < n ; i++) { 

			if (arr[i] > first) { 
					second = first; 
					first = arr[i]; 
			} 

			else if (arr[i] > second && arr[i] != first) 
				second = arr[i]; 
			} 

		if (second == Integer.MIN_VALUE) 
			System.out.print("There is no second largest"+ " element"); 
		else
			System.out.print("The second largest element"+  " is "+ second); 
	}

}


