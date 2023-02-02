package com.example.logical;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		int temp = 0;
	   int n = arr.length;  
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 52, 68, 45, 81, 30, 7, 5, 2 };
		
		
		bubbleSort(arr);
		
		System.out.println("Array After Bubble Sort");  
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	

}
