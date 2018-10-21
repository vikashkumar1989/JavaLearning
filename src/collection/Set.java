package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ramesh");
		hs.add("Mukesh");
		hs.add("Vikash");		
		System.out.println(hs);
		System.out.println(hs.size());
		Iterator<String> ir1 =hs.iterator();
		while(ir1.hasNext()) {
			System.out.println(ir1.next());
		}
	
		
		LinkedHashSet<String> hs2=new LinkedHashSet<String>();
		hs2.add("Ramesh");
		hs2.add("Mukesh");
		hs2.add("Vikash");
		System.out.println(hs2);
		System.out.println(hs2.size());
		Iterator<String> ir2 =hs2.iterator();
		while(ir2.hasNext()) {
			System.out.println(ir2.next());
		}
		
		
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Ramesh");
		ts1.add("Mukesh");
		ts1.add("Vikash");
		System.out.println(ts1);
		System.out.println(ts1.size());
		Iterator<String> ir3 =ts1.iterator();
		while(ir3.hasNext()) {
			System.out.println(ir3.next());
		}
	}

}
