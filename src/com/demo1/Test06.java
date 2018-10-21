package com.demo1;

public class Test06 {void display(int accountId, int... amount){
	int sum=0;
	for(int x:amount){
		sum+=x;
	}
System.out.println("The sum is: "+accountId+sum);
}

public static void main(String[] args) {
	Test06 account=new Test06();
	 account.display(1001,20,30,40,60,80);
}

}
