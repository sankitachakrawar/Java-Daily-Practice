package com.example.collection;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfSet {

	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(4);
		
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
