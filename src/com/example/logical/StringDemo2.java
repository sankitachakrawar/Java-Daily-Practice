package com.example.logical;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str="sankita";
		String str1 ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number >>");
		int n = scanner.nextInt();
		
		    char[] chars = str.toCharArray();
		    int length = chars.length;
		    for (int i = 0; i<length- n; i++) {
	
		    	char temp=chars[i-1];
		    	chars[i-1]=chars[i];
		    	chars[i]=temp;
		     }
		    System.out.println(chars);
		}
}

