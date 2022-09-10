// WAP to find missing elements from the array?
package com.example;

public class MissingArrayElement {

	public static void main(String[] args) {
		
		 int[] nums = { 1, 2, 4, 5, 6 };
	 int n=nums.length;
     int sum=((n+1)*(n+2))/2;
     for(int i=0;i<n;i++)
       sum-=nums[i];

	System.out.println("missing number is:"+sum);
	
	}
	
}
	
