package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sd.format(c.getTime()));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

	}

}
