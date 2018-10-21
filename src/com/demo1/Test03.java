package com.demo1;

public class Test03 {
	static int balance=100;
	static int balance2=100;
	int balance3=300;
	static {
		balance=100;
	}
	public int getBalance(int deposit) {
		balance=balance+deposit;
		return balance;
	}
	


}
