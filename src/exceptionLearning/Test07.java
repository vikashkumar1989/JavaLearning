package exceptionLearning;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong();
		
		for(long i=l-1;i>0;i--) {
			l=l*i;
		}
		System.out.println("Factorial of number :"+l);

	}

}
