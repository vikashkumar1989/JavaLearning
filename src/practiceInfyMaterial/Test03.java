package practiceInfyMaterial;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=0;
		double minbal=500;
		double depositAmt=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the amount to be deposited");
			depositAmt=sc.nextInt();
		} while(depositAmt<minbal);
		balance=depositAmt;
		System.out.println("Deposited successfully");
		System.out.println("New balance is :"+balance);
		
		

	}

}
