package com.demo9;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
	String courseName;
	public Course(String courseName){
		this.courseName=courseName;
	}
	public String toString() {
		return courseName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course("Math");
		Course c2=new Course("Science");
		Course c3=new Course("Hindi");
		Course c4=new Course("English");
		ArrayList<Course> courseList=new ArrayList<>();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		courseList.add(c4);
		
		System.out.println("----------Conventional for loop--------");
		for(int i=0;i<courseList.size();i++) {
			System.out.println(courseList.get(i));
		}
		System.out.println("-------Enhanced for each loop---------");
		for(Course c:courseList) {
			System.out.println(c);
		}
		System.out.println("-----------Iterator--------------");
		Iterator<Course> courseIterator=courseList.iterator();		
		while(courseIterator.hasNext()){
			Course c=courseIterator.next();
			System.out.println(c);
		}

	}

}
