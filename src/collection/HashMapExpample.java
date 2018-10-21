package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExpample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1,"Vikash");
		hm.put(2,"Pradeep");
		hm.put(3,"Aashin");
		hm.put(1,"Mukesh");
		System.out.println(hm.get(1)+"\t"+hm.get(2)+"\t"+hm.get(4));
	
	

	}

}
