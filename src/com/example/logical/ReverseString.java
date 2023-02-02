//4. Find the reverse of the string
package com.example.logical;

public class ReverseString {

	public static void main(String[] args) {
		String str = "welcome";
		String rev = "";
		char ch;
		//logic1
		for(int i=0;i<str.length();i++) {
			ch =str.charAt(i);
			rev =ch + rev;
		}
		System.out.println("logic1>>"+rev);
		
		//logic2
		char[] chars=str.toCharArray();
		for(int i=chars.length -1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		//logic3
		 String[] token = str.split("");    //used split method to print in reverse order
	     for(int i=token.length-1; i >= 0; i--)
	     {
	    
	          System.out.print(" "+token[i]);
	     }
	}
}
