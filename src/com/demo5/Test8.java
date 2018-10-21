package com.demo5;

import java.util.Calendar;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int date=cal.get(Calendar.DATE);
		int month=cal.get(Calendar.MONTH)+1;
		int Year=cal.get(Calendar.YEAR);
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int millisec=cal.get(Calendar.MILLISECOND);
		System.out.println(cal.getTime());
		cal.set(1989, 11, 10);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, -3);
		System.out.println(cal.getTime());
		System.out.println("Today is "+date+"/"+month+"/"+Year+" "+hour+":"+minute+":"+second+":"+millisec);

	}

}
