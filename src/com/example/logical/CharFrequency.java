package com.example.logical;

public class CharFrequency {

	public static void main(String[] args) {

		String str = "welcome to java e";
		char ch = 'e';

		int frequency = 0;
		for (int i = 0; i < str.length(); i++)
			if (ch == str.charAt(i)) {
				++frequency;
			}
		System.out.println(frequency);
	}
}
