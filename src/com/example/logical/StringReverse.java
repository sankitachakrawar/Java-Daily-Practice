package com.example.logical;

import java.util.regex.Pattern;

public class StringReverse {

	public static void main(String[] args) {

		String str = "hi i am sankita";

		String rev = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reverse String>>>" + rev);

		String[] split = str.split(" ");
		String capital = "";
		for (String words : split) {
			String first = words.substring(0, 1);
			String afterFirst = words.substring(1);
			capital += first.toUpperCase() + afterFirst + " ";

		}
		System.out.println(capital);

		String result = "";
		String[] str1 = rev.split(" ");
		
		for (int i = str1.length - 1; i >= 0; i--) {
			result = result + str1[i] + " ";
		}
		System.out.println("Revr>>  " + result);

	}
}
