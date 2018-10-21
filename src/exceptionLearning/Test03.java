package exceptionLearning;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {1,2,3,4,5,6};
		int intvar=0;
		try {
			intvar=intArray[9];
		}catch(Exception ec) {
			System.out.println("An exception Occured Here :-"+ec.getMessage());
		} finally {
			System.out.println("This is from with in the finally block");
			System.exit(0);
			
		}
		System.out.println("This will be part of response");

	}

}
