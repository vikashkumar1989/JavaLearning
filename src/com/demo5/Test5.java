package com.demo5;

public class Test5 {
	public void compare(String str) {
		if("null".equals(str)) {
			System.out.println("Hi");
		}
		if(str.equals("null")) {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1=new Test5();
		t1.compare(null);

	}

}
