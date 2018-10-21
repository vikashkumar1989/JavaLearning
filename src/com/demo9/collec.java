package com.demo9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		List<String> l2=new LinkedList<>();
		Set<String> s1=new HashSet<>();
		Set<String> s2=new LinkedHashSet<>();
		
		l1.add("Vikash");
		l1.add("Pradeep");
		l1.add("Ashin");
		l1.add("Vikash");
		l1.remove(2);
		for(String s:l1) {
			System.out.println(s);
		}
		
		System.out.println("--------");
		l2.add("Vikash");
		l2.add("Pradeep");
		l2.add("Ashin");
		l2.add("Vikash");
		l2.remove(2);
		for(String s:l2) {
			System.out.println(s);
		}
		System.out.println("--------");
		s1.add("Vikash");
		s1.add("Pradeep");
		s1.add("Ashin");
		s1.add("Vikash");
		s1.remove(2);
		for(String s:s1) {
			System.out.println(s);
		}
		System.out.println("--------");
		s2.add("Vikash");
		s2.add("Pradeep");
		s2.add("Ashin");
		s2.add("Vikash");
		s2.remove(2);
		for(String s:s2) {
			System.out.println(s);
		}


	}

}
