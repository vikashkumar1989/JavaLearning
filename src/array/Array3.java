package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int ar[][]= {{1,2,3},{4,5,6},{7,9,8}};
				int min=ar[0][0];
				int mcol=0;
				for(int i=0;i<3;i++) {			
					for(int j=0;j<3;j++) {
						if(ar[i][j]<min) {
							min=ar[i][j];
							mcol=j;

						}

					}
				}
				int max=ar[0][mcol];
				int k=0;
				while(k<3) {
					if(ar[k][mcol]>max) {
						max=ar[k][mcol];
					}
					k++;
				}
System.out.println("maximum value in the column where minimum value exist is "+max);


	}

}
