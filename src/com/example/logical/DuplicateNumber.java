//WAP with 2 different logic, to find all duplicate number in an array
package com.example.logical;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int arr[] = {25,69,86,45,25,35,69};
		for(int i=0 ; i < arr.length ; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] != arr[j]) {
					System.out.println(arr[i]);
				}
			}		
		}
	}
}
