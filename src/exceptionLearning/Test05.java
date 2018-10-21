package exceptionLearning;

public class Test05 {
	public double method1(int i,int j) {
		double d = 0;
		try {
			if(j==0) {
				throw new Exception("The divisor should not be zero");
			}else {
				d=i/j;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test05 t=new Test05();
		int[] j= {1,0,3,4,10};
		try{
			System.out.println(t.method1(10, 0));			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		try {
			System.out.println(t.method1(j[4], j[1]));			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		

	}

}
