package com.demo8;

public class Test01 {
	public static void divide(int x, int y) throws Exception {
		int z = 0;	
			if(y==0) 
				throw new Exception("Divisor can't be zero");
				z=x/y;
				System.out.println(z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(100,0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
