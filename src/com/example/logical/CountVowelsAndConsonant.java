package com.example.logical;

public class CountVowelsAndConsonant {

	public static void main(String[] args) {
		
		int vowels =0;
		int consonant =0;
		String str ="java is programming language";
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char  ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' ||  ch == 'u') {
				vowels++;
			}else if (ch >= 'a' || ch <='z') {
				consonant++;
			} 
		}
		 System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonant);
	}
}
