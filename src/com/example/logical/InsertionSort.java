package com.example.logical;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	public static void insertionSort(int arr[])
	{
		
	    for(int i=1; i<arr.length;i++) {
	        int current =arr[i];
	        int j=i-1;
	        /* Move elements of arr[0..i-1], that are
	        greater than key, to one position ahead
	        of their current position */
	       
	        while(j>=0 && current<arr[j]) {
	            arr[j+1]=arr[j];
	          
	            j--;
	           
	        }
	      
	        arr[j+1]=current;
	       
	    }
	}
	
}
