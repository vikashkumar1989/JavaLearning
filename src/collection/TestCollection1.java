package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Pradeep");
		ar.add("Aashin");
		ar.add("Vikash");
		
		//traversing through Iterator
		Iterator ir=ar.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		//traversing through For Each
		for(String str:ar) {
			System.out.println(str);
		}
		

	}

}
