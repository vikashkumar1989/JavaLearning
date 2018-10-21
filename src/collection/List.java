package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(0, 4);
		l1.add(6);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		
		for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
		}
		System.out.println("______");
		for(Integer i:l1) {
			System.out.println(i);
		}
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(0, 4);
		l2.addFirst(5);
		l2.addLast(6);
		System.out.println("______");
		for(Integer i:l2) {
			System.out.println(i);
		}
		

	}

}
