package com.demo1;

public class Test10 {
	
	public void getName(String fn, String ln) {
		String name=fn.concat(ln);
		System.out.println(name);
		StringBuffer sb=new StringBuffer(fn);
		sb.append(" ");
		System.out.println(sb);
		name=sb.toString();
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 t=new Test10();
		t.getName("Vikash", "Kumar");

	}

}
