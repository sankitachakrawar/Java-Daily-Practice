package com.example.logical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {

//	public static void main(String[] args) {
//		
//		List<Integer> l1= new ArrayList<>();
//		l1.add(1);
//		l1.add(2);
//		l1.add(4);
//		
//		List<Integer> l2=new ArrayList<>();
//		l2.add(1);
//		l2.add(3);
//		l2.add(4);
//	
//		l1.addAll(l2);
//		Collections.sort(l1);
//		System.out.println(l1);
//	}
	
	
	public static void main(String[] args) {
		int a[] = {1,2,4};
		int b[] = {1,3,4};
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
			
		}
		for(int j=0;j<b.length;j++) {
			list.add(b[j]);
			
		}
		Collections.sort(list);
		System.out.println(list);
	}
	
}
