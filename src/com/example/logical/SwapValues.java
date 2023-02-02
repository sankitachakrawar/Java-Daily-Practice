//3.Swap Values without using any variable a=10, b=12
package com.example.logical;

public class SwapValues {

	public static void main(String[] args) {
		 int a=10;
		 int b=12;
		 
		 a = a + b;
		 b = a - b;
		 a = a - b;
		 System.out.println("after swap:"+a +" " +b);
	}
}
