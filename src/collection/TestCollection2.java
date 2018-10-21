package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class TestCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		Student st1=new Student(123,"Vikash",29);
		Student st2=new Student(456,"Pradeep",28);
		Student st3=new Student(789,"Aashin",30);
		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		
		ArrayList<Student> ar2=new ArrayList<Student>();
		Student st4=new Student(123,"Ashish",29);
		Student st5=new Student(456,"Nisha",32);
		ar2.add(st4);
		ar2.add(st5);
		ar.addAll(ar2);
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("Sunil");
		ar3.add("Shweta");
		
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("Sunil");
		ar4.add("Nikhil");
		
		ar3.retainAll(ar4);
		
		Iterator<Student> ir=ar.iterator();
		while(ir.hasNext()) {
			
			Student st=(Student) ir.next();			
			System.out.println("Name:"+st.name+" Roll No :"+st.rollno+" Age:"+st.age);
		}
		
		Iterator ir2=ar3.iterator();
		while(ir2.hasNext()) {
			System.out.println(ir2.next());
		}

	}

}
