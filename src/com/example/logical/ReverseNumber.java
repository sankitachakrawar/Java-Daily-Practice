//2.WAP to reverse an integer without converting it to a string.
package com.example.logical;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 5942;
		int rev_num=0;
		
		while(num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num/10;
		}
		System.out.println("reverse Number:"+rev_num);
	}
}
