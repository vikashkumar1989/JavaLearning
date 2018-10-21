package com.demo5;

public class Customer {
	private int id;
	private String name;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object ob) {
		Customer cust=(Customer) ob;
		if(this.hashCode()==cust.hashCode()) {
			return this.name.equals(cust.name);
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(123,"vikash");
		Customer c2=new Customer(123,"Pradeep");
		if(c1.equals(c2)) {
			System.out.println("Equal Object");
		}
		else {
			System.out.println("Not equal object");
		}

	}

}
