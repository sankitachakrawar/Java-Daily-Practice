package com.example;

public class CountWords {

	public static void main(String[] args) {

		String str = "Hello my name is sankita my name is sankita is";
		str=str.toLowerCase();
		String words[] =str.split(" ");
		int count=0;
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count ++;
					 words[j]="0";
				}
				
			}
			 if(words[i]!="0")
		     System.out.println(words[i]+":"+count);
			 count=1;
		}
	}
}