package exceptionLearning;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(Double.valueOf("420.00"));
		}catch(Exception e) {
			System.out.println("Some error");
		}

	}

}
