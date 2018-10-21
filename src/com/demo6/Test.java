package com.demo6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1=new Parent();
		obj1.method1();
		obj1.method2();
		obj1.method4();
		Parent obj2=new Child();
		obj2.method1();
		obj2.method2();
		obj2.method4();
		Child obj3=new Child();
		obj3.method1();
		obj3.method2();
		obj3.method4();
		obj3.method5();
	}

}
