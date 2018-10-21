package collection;

import java.util.LinkedList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> l1=new LinkedList<>();
		LinkedList<Employee> l2=new LinkedList<>();
		Employee e1=new Employee(123);
		Employee e2=new Employee(123);
		
		l1.addFirst(e1);
		l2.addFirst(e2);
		
		System.out.println(l1.getFirst());
		System.out.println(l2.getFirst());
		System.out.println(l1.contains(l2.getFirst()));

	}

}
