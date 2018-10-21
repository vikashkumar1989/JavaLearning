package com.demo1;


import java.util.Calendar;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int date=cal.get(Calendar.DATE);
		int month=cal.get(Calendar.MONTH)+1;
		int year=cal.get(Calendar.YEAR);
		int time=cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		System.out.println("Date is: "+date+"/"+month+"/"+year+" Time is: "+time+":"+min+"::"+sec);

	}

}
