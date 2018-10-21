package com.demo5;

public class Test6 {
	public String getName(String fn,String ln) {
		 String name=fn.concat(ln);
		 return name;
	}
	public String getName2(String fn,String ln) {
		StringBuffer sb=new StringBuffer(fn);
		String name =sb.append(ln).toString();
		return name;
	}
	public String getName3(String fn,String ln) {
		StringBuilder sb=new StringBuilder(fn);
		String name =sb.append(ln).toString();
		name=sb.reverse().toString();
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t=new Test6();
		System.out.println(t.getName("Vikash", "Kumar"));
		System.out.println(t.getName2("Vikash", "Kumar"));
		System.out.println(t.getName3("Vikash", "Kumar"));

	}

}
