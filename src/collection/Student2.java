package collection;

import java.util.HashSet;

public class Student2 {
	private String name;
	private int rollNumber;
	

	public Student2(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
//getClass().getName() + '@' + Integer.toHexString(hashCode())

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> rno=new HashSet<Integer>();
		rno.add(1001);
		rno.add(1001);
		Student2 s1= new Student2("Vikash",1001);
		Student2 s2= new Student2("Pradeep",1001);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		

	}

}
