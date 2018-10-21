package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String >hp=new HashMap<Integer, String>();
		hp.put(1, "Vikash");
		hp.put(2, "Pradeep");
		hp.put(3, "Asheen");
		//System.out.println(hp.get(2));
		
		Set s1=hp.entrySet();
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			Map.Entry mp=(Map.Entry)i1.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
