package com.demo5;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] obj=new Object[2];
		Object obj2=new Object();
		Integer i1=new Integer(4);
		Integer i2=new Integer(6);
		obj[0]="123";
		obj2="234";
		String i=(String) obj[0];
		Object j=obj2;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(i1*i2);
		System.out.println(i1.floatValue());

	}

}
