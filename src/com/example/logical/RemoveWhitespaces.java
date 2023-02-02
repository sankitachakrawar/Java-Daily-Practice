package com.example.logical;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		
		String str =" thi s is j av a progra mming";
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
