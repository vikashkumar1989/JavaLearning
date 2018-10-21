package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {{1,2,3},{4,5,6},{7,0,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("value of ar["+i+"]["+j+"] is :"+ar[i][j]);
			}
		}

	}

}
