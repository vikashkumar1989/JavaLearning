package com.demo1;

import java.util.Arrays;

public class  Test05{
	public static String[] Details(int...number) {
		String value[]=new String[number.length];
		int j=0;
		for(int i:number) {
			System.out.println("Details for :"+i);
			value[j]=""+i;
			j++;
		}
		
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=Details(1,2,3);
		System.out.println(Arrays.toString(str));
		
		String[] str2=Details(1,2,3,5,655,546,342);
		System.out.println(Arrays.toString(str2));

	}

}
