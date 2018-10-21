package com.demo5;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your roll number");
		int rollno=sc.nextInt();
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter your fee");
		double fee=sc.nextDouble();
		
		System.out.println("Your Roll No :"+rollno);
		System.out.println("Your Name    :"+name);
		System.out.println("your Fee     :"+fee);

	}

}
