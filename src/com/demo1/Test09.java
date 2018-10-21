package com.demo1;

public class Test09 {
	public void checkName(String a) {
		String b="infosys";
		if(a.equals("infosys")){
			System.out.println("Valid1");
		}
		if(a==b) {
			System.out.println("Valid2");
		}
		if(a.equals(new String("infosys"))) {
			System.out.println("valid3");
		}
		if(a==new String("infosys")) {
			System.out.println("valid4");
		}
		if(b==a) {
			System.out.println("Valid5");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test09().checkName("infosys");		

	}

}
