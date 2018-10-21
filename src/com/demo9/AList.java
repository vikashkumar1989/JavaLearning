package com.demo9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Ar=new ArrayList<>();
		Ar.add(1);
		Ar.add(2);
		Ar.add(3);
		Ar.add(4);
		List<String> Ar2=new ArrayList<>();
		Ar2.add(0, "Vikash");
		Ar2.add(1, "Pintu");
		Iterator<Integer> Ai=Ar.iterator();
		while(Ai.hasNext()) {
			System.out.println(Ai.next());
		}
		for(Integer i:Ar) {
			System.out.println(i);
		}
		Iterator<String> As=Ar2.iterator();
		for(String St:Ar2) {
			System.out.println(St);
		}

	}

}
