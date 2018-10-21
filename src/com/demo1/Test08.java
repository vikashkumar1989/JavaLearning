package com.demo1;

public class Test08 {
	
	public void compare(String s) {
		
		if("null".equals(s)) {
			System.out.println("DEF");
		}
		if(s.equals("null")) {
			System.out.println("ABC");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test08 T=new Test08();
		T.compare("null");	
		T.compare(null);
	

	}

}
