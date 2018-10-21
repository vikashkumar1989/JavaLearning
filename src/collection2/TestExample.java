package collection2;

import java.util.Calendar;

public class TestExample {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int d=cal.get(Calendar.DATE);
		int ap=cal.get(Calendar.AM_PM);
		System.out.println(d);
		System.out.println(ap);
	}
	
	

}
