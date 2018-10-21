package exceptionLearning;

public class Test04 {
	public double method1(int i,int j) {
		double d=i/j;
		return d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04 t=new Test04();
		int[] j= {1,0,3,4,5};
		try{
			double d1=t.method1(10, 0);
			System.out.println(d1);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			double d2=t.method1(j[6], j[0]);
			System.out.println(d2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
