package com.demo1;

public class Test1 {
	public String s1= "vikash";
		   String s2= "Pradeep";
	protected String s3="Ashin";
	private String s4="Ashish";
	
	public void method1() {
		System.out.println("Method1");
	}
	void method2() {
		System.out.println("Method2");
	}
	protected void method3() {
		System.out.println("Method3");
	}
	private void method4() {
		System.out.println("Method4");
	}
	public class Testing1{
		public void method5() {
			System.out.println("Method5");
			System.out.println(s4);
		}
	}


}
