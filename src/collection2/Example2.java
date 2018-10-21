package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,43,56,76,12,44,56,99,87,100000,3872983,38427938,62,28739,349280,0};
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			a1.add(a[i]);
		}
		Collections.sort(a1);
		
		System.out.println("Lowest number is :"+a1.get(0));
		System.out.println("Highest number is :"+a1.get(a.length-1));
		System.out.println("Second Highest number is :"+a1.get(a.length-2));
		System.out.println("Fifth Highest number is :"+a1.get(a.length-5));
		
		
		int index=Collections.binarySearch(a1, 0,Collections.reverseOrder());
		
		if(index!=0) {
			System.out.println("Number found a Index :"+index);
		}
		else {
			System.out.println("NUmber Not found");
		}
		

	}

}
