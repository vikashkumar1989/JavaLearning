package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {{1,2,3},{4,5,3},{7,9,8}};


		int min=ar[0][0];
		for(int i=0;i<3;i++) {			
			for(int j=0;j<3;j++) {
				if(ar[i][j]<min) {
					min=ar[i][j];
					
				}
				
			}
		}
		System.out.println("Mininum value of array is :"+min);

	}

}
