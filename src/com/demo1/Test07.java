package com.demo1;

public class Test07 {
	enum E1{
		A,B,C,D,E,F,G;
	}
	public void method(E1 e1) {
		switch(e1) {
		case A:
			System.out.println("A");
			break;
		case B:
			System.out.println("B");
			break;
		case C:
			System.out.println("C");
			break;
		case D:
			System.out.println("D");
			break;	
		default:
			System.out.println("no Match");		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test07 T1=new Test07();
		T1.method(E1.G);
		
	}

}
