package collection2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		a1.add("Vikash");
		a1.add("Sunil");
		a1.add("Nisha");
		a1.add(0, "Mahesh");
		a1.add(0, "Sita");
		
		a2.add("Vikash");
		a2.add("Sunil");
		a2.add("Nisha");
		a2.add(0, "Mahesh");
		//a2.add(0, "Sita");
		System.out.println(a1);
		System.out.println(a1.size());
		a1.remove(2);
		System.out.println(a1);	
		System.out.println(a1.contains("Sita"));
		//a1.clear();
		a1.remove("Viks");
		a1.addAll(a2);
		a1.removeAll(a2);
		System.out.println(a1);
		

	}

}
