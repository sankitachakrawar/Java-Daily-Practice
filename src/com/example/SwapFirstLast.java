package com.example;

import java.util.Arrays;

public class SwapFirstLast {

	 public static void main(String[] args)
	 {
	    int[] arr = {20, 30, 40};
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		int x = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = x;
		System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arr));  
	 }
}
