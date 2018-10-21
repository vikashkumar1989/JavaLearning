package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= new ArrayList<String>();
		l1.add("Vikash");
		l1.add(new String("Ramesh"));
		l1.add(1,"Pradeep");
		l1.add(2,"Ashin");
		
		Iterator<String> ir=l1.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		for(String name:l1) {
			System.out.println(name);
		}

	}

}
