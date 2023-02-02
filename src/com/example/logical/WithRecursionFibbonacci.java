package com.example.logical;

public class WithRecursionFibbonacci {

//	 static int n1=0,n2=1,n3=0; 
//	public static void main(String[] args) {
//		 int num=10;    
//		  System.out.print(n1+" "+n2);   
//		  fibbo(num-2);  
//		 }  
//	public static void fibbo(int num) {
//		 if(num > 0){    
//	         n3 = n1 + n2;    
//	         n1 = n2;    
//	         n2 = n3;    
//	         System.out.print(" "+n3);   
//	         fibbo(num - 1);    
//	     }
//	}
		
	static int a=0,b=1,c;
	public void fibbo(int i) {
	if(i>=1) {
		c=a+b;
		System.out.println(" "+c+" ");
		a=b;
		b=c;
		fibbo(i-1);
	}
		
	}
	public static void main(String[] args) {
		WithRecursionFibbonacci obj=new WithRecursionFibbonacci();
		System.out.println(a+ " "+b);
		obj.fibbo(10);
	}
}
