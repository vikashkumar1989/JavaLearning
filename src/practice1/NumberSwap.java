package practice1;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers tow swap");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");		
		int b=sc.nextInt();
		System.out.println("Before Swapping a="+a+" and Before Swapping b="+b);
		int x=a;
		a=b;
		b=x;
		System.out.println("After Swapping b="+a+" and After Swapping a="+b);
		

	}

}
