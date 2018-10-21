package com.demo8;

class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}
public class Test02 {
	static void testCode() throws MyOwnException {
		try {
			throw new MyOwnException("test exception");
		} catch (Exception ex) {
			System.out.print(" generic exception caught ");
		}
	}
	public static void main(String[] args) {
		try {
			testCode();
		} catch (MyOwnException ex) {
			System.out.print("custom exception handling");
		}
	}
}