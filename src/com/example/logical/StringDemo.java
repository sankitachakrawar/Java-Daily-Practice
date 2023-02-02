package com.example.logical;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String >>");
		String str=scanner.next();
		System.out.println("Enter number >>");
		int a = scanner.nextInt();
			a = a % str.length();
			String str2=str.substring(str.length() - a) +str.substring(0, str.length() - a);
			System.out.println(str2);
	}
	
//	if (str.length() < a) {
//	System.out.println(str);
//}
//	String str2=str.substring(str.length() - a) +str.substring(0, str.length() - a);	
//	System.out.println(str2);
	
	

}
