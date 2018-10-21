package practice1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which you want factorial");
		long a=sc.nextLong();
		long num=a;
		long num2=a-1;
		for(long i=num2;i>0;i--) {
			a=a*i;
		}
		System.out.println("Factorial of number "+num+" is : "+a);

	}

}
