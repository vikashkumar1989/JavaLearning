package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vikash");
		hs.add("Rahul");
		hs.add("Majhi");
		hs.add("Ankit");

		System.out.println(hs);
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s:hs) {
			System.out.println(s);
		}

		
	}

}
