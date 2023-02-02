package com.example.collection;

import java.util.HashSet;
import java.util.Set;

public class UnionOfSet {

	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(40);
		set2.add(50);
		
		set1.addAll(set2);
		System.out.println(set1);
	}
}
