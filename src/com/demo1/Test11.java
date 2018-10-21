package com.demo1;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Roll no:");
		int rollno=sc.nextInt();
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your Fee:");
		long fee=sc.nextLong();
		System.out.println("Your Roll no is: "+rollno);
		System.out.println("Your Name is: "+name);
		System.out.println("Your Fee is: "+fee);
		sc.close();

	}

}
